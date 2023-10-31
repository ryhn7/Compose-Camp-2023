package com.example.marsphotos

import com.example.marsphotos.data.MarsPhotoRepositoryImpl
import com.example.marsphotos.fake.FakeApiService
import com.example.marsphotos.fake.FakeDataSource
import junit.framework.TestCase
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MarsPhotoRepositoryImplTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runTest {
        // Given
        val fakeApiService = FakeApiService()
        val marsPhotoRepository = MarsPhotoRepositoryImpl(fakeApiService)

        // When
        val marsPhotos = marsPhotoRepository.getPhotos()

        // Then
        TestCase.assertEquals(FakeDataSource.photosList, marsPhotos)
    }
}