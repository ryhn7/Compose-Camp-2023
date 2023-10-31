package com.example.amphibiansapp.di

import android.content.Context
import com.example.amphibiansapp.core.data.remote.ApiConfig
import com.example.amphibiansapp.data.remote.AmphibiansApi
import com.example.amphibiansapp.data.repository.AmphibiansRepositoryImpl
import com.example.amphibiansapp.domain.interface_repository.AmphibiansRepository
import com.example.amphibiansapp.domain.use_cases.GetAllAmphibians
import com.example.amphibiansapp.domain.use_cases.UseCasesAmphibians
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AmphibiansModule {

    @Provides
    @Singleton
    fun provideAmphibiansRepository(amphibiansApi: AmphibiansApi): AmphibiansRepository {
        return AmphibiansRepositoryImpl(amphibiansApi)
    }

    @Provides
    @Singleton
    fun provideAmphibiansApi(@ApplicationContext context: Context): AmphibiansApi {
        return ApiConfig.getApiService(AmphibiansApi::class.java, context)
    }

    @Provides
    @Singleton
    fun provideAmphibiansUseCases(repository: AmphibiansRepository): UseCasesAmphibians {
        return UseCasesAmphibians(
            getAllAmphibians = GetAllAmphibians(repository),
        )
    }
}