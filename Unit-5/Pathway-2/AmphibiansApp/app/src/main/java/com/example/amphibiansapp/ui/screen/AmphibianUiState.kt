package com.example.amphibiansapp.ui.screen

import com.example.amphibiansapp.data.model.AmphibiansResponseItem

data class AmphibianUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val amphibians: List<AmphibiansResponseItem>? = null,
)
