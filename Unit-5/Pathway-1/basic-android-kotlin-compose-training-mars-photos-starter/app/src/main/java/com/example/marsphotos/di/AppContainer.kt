package com.example.marsphotos.di

import com.example.marsphotos.data.MarsPhotoRepositoryImpl

interface AppContainer {
    val marsPhotoRepositoryImpl: MarsPhotoRepositoryImpl
}