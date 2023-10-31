package com.example.marsphotos

import com.example.marsphotos.fake.FakeMarsPhotoRepositoryImpl
import com.example.marsphotos.rules.TestDispatcherRule
import com.example.marsphotos.ui.screens.MarsUiState
import com.example.marsphotos.ui.screens.MarsViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            // Given
            val marsPhotoRepository = FakeMarsPhotoRepositoryImpl()
            val marsViewModel = MarsViewModel(marsPhotoRepository)
            val listResult = marsPhotoRepository.getPhotos()


            // When
            val marsUiStateSuccess = marsViewModel.marsUiState

            // Then
            assertEquals(
                MarsUiState.Success(listResult), marsUiStateSuccess
            )
        }
}