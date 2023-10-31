package com.example.marsphotos.fake

import com.example.marsphotos.domain.interface_repository.MarsPhotoRepository
import com.example.marsphotos.network.MarsPhotoItem

class FakeMarsPhotoRepositoryImpl : MarsPhotoRepository {
    override suspend fun getPhotos(): List<MarsPhotoItem> {
        return FakeDataSource.photosList
    }
}