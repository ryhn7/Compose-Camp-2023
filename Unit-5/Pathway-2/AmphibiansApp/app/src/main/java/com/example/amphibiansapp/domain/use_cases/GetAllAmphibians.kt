package com.example.amphibiansapp.domain.use_cases

import androidx.lifecycle.LiveData
import com.example.amphibiansapp.core.common.ResultState
import com.example.amphibiansapp.data.model.AmphibiansResponseItem
import com.example.amphibiansapp.domain.interface_repository.AmphibiansRepository

class GetAllAmphibians(private val repository: AmphibiansRepository) {
    suspend operator fun invoke(): LiveData<ResultState<List<AmphibiansResponseItem>>> {
        return repository.getAllAmphibians()
    }
}