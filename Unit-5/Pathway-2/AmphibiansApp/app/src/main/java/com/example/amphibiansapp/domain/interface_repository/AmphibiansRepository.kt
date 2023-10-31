package com.example.amphibiansapp.domain.interface_repository

import androidx.lifecycle.LiveData
import com.example.amphibiansapp.core.common.ResultState
import com.example.amphibiansapp.data.model.AmphibiansResponseItem

interface AmphibiansRepository {
    suspend fun getAllAmphibians(): LiveData<ResultState<List<AmphibiansResponseItem>>>
}