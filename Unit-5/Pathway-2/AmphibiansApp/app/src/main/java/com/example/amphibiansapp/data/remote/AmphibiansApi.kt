package com.example.amphibiansapp.data.remote

import com.example.amphibiansapp.data.model.AmphibiansResponse
import retrofit2.http.GET

interface AmphibiansApi {
    @GET
    suspend fun getAllAmphibians(): AmphibiansResponse
}