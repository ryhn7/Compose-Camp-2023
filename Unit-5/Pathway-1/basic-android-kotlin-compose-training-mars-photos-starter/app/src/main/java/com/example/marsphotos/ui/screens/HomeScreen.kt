/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.marsphotos.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.marsphotos.R
import com.example.marsphotos.network.MarsPhotoItem
import com.example.marsphotos.ui.theme.MarsPhotosTheme

@Composable
fun HomeScreen(
    marsUiState: MarsUiState,
    modifier: Modifier = Modifier
) {
    when (marsUiState) {
        is MarsUiState.Loading -> LoadingScreen(modifier = modifier)
        is MarsUiState.Success -> PhotosGridScreen(
            photos = marsUiState.photos,
            modifier = modifier.fillMaxWidth()
        )

        is MarsUiState.Error -> ErrorScreen(modifier = modifier)
    }
}

@Composable
fun MarsPhotoCard(
    photos: MarsPhotoItem,
    modifier: Modifier
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        val showShimmer = remember { mutableStateOf(true) }
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(photos.imgSrc)
                .crossfade(true)
                .build(),
            error = painterResource(R.drawable.ic_broken_image),
            contentDescription = stringResource(R.string.mars_photo),
            contentScale = ContentScale.Crop,
            onSuccess = { showShimmer.value = false },
            modifier = Modifier
                .background(shimmerBrush(targetValue = 1300f, showShimmer = showShimmer.value))
                .fillMaxWidth()
        )
//        val context = LocalContext.current
//        CoilImage(
//            imageRequest = {
//                ImageRequest.Builder(context)
//                    .data(photos.imgSrc)
//                    .crossfade(true)
//                    .build()
//            },
//            imageOptions = ImageOptions(
//                contentDescription = stringResource(R.string.mars_photo),
//                contentScale = ContentScale.Crop,
//            ),
//            component = rememberImageComponent {
//                // shows a shimmering effect when loading an image.
//                +ShimmerPlugin(
//                    baseColor = Color.LightGray.copy(alpha = 0.2f),
//                    highlightColor = Color.LightGray.copy(alpha = 0.6f),
//                )
//            },
//            failure = {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_broken_image),
//                    contentDescription = stringResource(R.string.mars_photo),
//                    modifier = Modifier.fillMaxWidth()
//                )
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .aspectRatio(1.5f)
//        )

    }
}

@Composable
fun PhotosGridScreen(
    photos: List<MarsPhotoItem>,
    modifier: Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(4.dp)
    )
    {
        items(photos) { photo ->
            MarsPhotoCard(
                photos = photo,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
            )
        }
    }
}

/**
 * ResultScreen displaying number of photos retrieved.
 */
@Composable
fun ResultScreen(photos: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Text(text = photos)
    }
}

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(200.dp),
        painter = painterResource(R.drawable.loading_img),
        contentDescription = stringResource(R.string.loading)
    )
}

@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_connection_error), contentDescription = ""
        )
        Text(text = stringResource(R.string.loading_failed), modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    MarsPhotosTheme {
        ResultScreen(stringResource(R.string.placeholder_result))
    }
}
