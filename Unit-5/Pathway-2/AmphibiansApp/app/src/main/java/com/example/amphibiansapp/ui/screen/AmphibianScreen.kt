package com.example.amphibiansapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.amphibiansapp.data.model.AmphibiansResponseItem
import com.example.amphibiansapp.ui.component.AmphibiansCard

@Composable
fun AmphibiansScreen(
    viewModel: AmphibianViewModel = hiltViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                MaterialTheme.colorScheme.background
            )
    ) {
        val state = viewModel.state

        if (state.isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else if (state.error != null) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                ErrorScreen(retryAction = { viewModel.getAllAmphibians() })
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Amphibians",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(start = 20.dp, top = 36.dp),
                )
                state.amphibians?.let {
                    SectionAmphibians(
                        listAmphibians = it,
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 72.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun SectionAmphibians(
    listAmphibians: List<AmphibiansResponseItem>,
    modifier: Modifier
) {
    val scrollState = rememberLazyListState()
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier,
        state = scrollState
    ) {
        items(listAmphibians) { data ->
            AmphibiansCard(
                name = data.name ?: "",
                type = data.type ?: "",
                image = data.imgSrc ?: "",
                description = data.description ?: "",
                modifier = Modifier
            )
        }
    }
}