package com.example.marsphotos.di

import com.example.marsphotos.domain.interface_repository.MarsPhotoRepository

interface AppContainer {
    val marsPhotoRepository: MarsPhotoRepository
}