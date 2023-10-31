package com.example.amphibiansapp.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.amphibiansapp.core.common.ResultState
import com.example.amphibiansapp.data.model.AmphibiansResponseItem
import com.example.amphibiansapp.data.remote.AmphibiansApi
import com.example.amphibiansapp.domain.interface_repository.AmphibiansRepository

class AmphibiansRepositoryImpl(private val amphibiansApi: AmphibiansApi) : AmphibiansRepository {
    override suspend fun getAllAmphibians(): LiveData<ResultState<List<AmphibiansResponseItem>>> =
        liveData {
            try {
                val response = amphibiansApi.getAllAmphibians()
                response.data?.let {
                    emit(ResultState.Success(it))
                }
            } catch (e: Exception) {
                emit(ResultState.Error(e.message.toString()))
            }
        }

}