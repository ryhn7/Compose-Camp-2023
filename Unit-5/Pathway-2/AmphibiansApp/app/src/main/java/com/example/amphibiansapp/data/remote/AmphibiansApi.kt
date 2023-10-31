package com.example.amphibiansapp.data.remote

import com.example.amphibiansapp.data.model.AmphibiansResponseItem
import retrofit2.http.GET

interface AmphibiansApi {
    @GET("amphibians")
    suspend fun getAllAmphibians(): List<AmphibiansResponseItem>
}