package com.example.amphibiansapp.ui.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.viewModelScope
import com.example.amphibiansapp.core.common.ResultState
import com.example.amphibiansapp.domain.use_cases.UseCasesAmphibians
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AmphibianViewModel @Inject constructor(
    private val useCases: UseCasesAmphibians,
) : ViewModel() {
    var state by mutableStateOf(AmphibianUiState())
        private set

    init {
        state = state.copy(
            isLoading = true
        )
        getAllAmphibians()
    }

    fun getAllAmphibians() = viewModelScope.launch {
        useCases.getAllAmphibians().asFlow().collect {
            when (it) {
                is ResultState.Loading -> {
                    state = state.copy(
                        error = null
                    )
                }
                is ResultState.Success -> {
                    state = state.copy(
                        isLoading = false,
                        error = null,
                        amphibians = it.data
                    )
                }
                is ResultState.Error -> {
                    state = state.copy(
                        isLoading = false,
                        error = it.error,
                    )
                }
            }
        }
    }
}
