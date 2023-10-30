package com.example.marsphotos.data

import com.example.marsphotos.domain.interface_repository.MarsPhotoRepository
import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhotoItem

class MarsPhotoRepositoryImpl(private val marsApiService: MarsApiService) : MarsPhotoRepository {
    override suspend fun getPhotos(): List<MarsPhotoItem> = marsApiService.getPhotos()

}