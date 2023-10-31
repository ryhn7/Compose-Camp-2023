package com.example.marsphotos

import com.example.marsphotos.fake.FakeMarsPhotoRepositoryImpl
import com.example.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MarsViewModelTest {
    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            // Given
            val marsPhotoRepository = FakeMarsPhotoRepositoryImpl()
            val marsViewModel = MarsViewModel(marsPhotoRepository)


            // When
//            val marsUiStateSuccess =
        }
}