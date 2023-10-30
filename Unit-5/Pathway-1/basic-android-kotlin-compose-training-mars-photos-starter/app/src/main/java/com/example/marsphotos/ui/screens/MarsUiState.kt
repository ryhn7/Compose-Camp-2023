package com.example.marsphotos.ui.screens

import com.example.marsphotos.network.MarsPhotoItem

sealed interface MarsUiState {
    data class Success(val photos: List<MarsPhotoItem>) : MarsUiState
    object Error : MarsUiState
    object Loading : MarsUiState
}
