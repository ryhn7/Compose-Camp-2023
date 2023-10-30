package com.example.marsphotos.domain.interface_repository

import com.example.marsphotos.network.MarsPhotoItem

interface MarsPhotoRepository {
    suspend fun getPhotos(): List<MarsPhotoItem>
}
