package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhotoItem

class FakeApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhotoItem> {
        return FakeDataSource.photosList
    }
}