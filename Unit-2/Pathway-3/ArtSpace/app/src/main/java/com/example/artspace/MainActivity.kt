package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.artspace.ui.data.dummyArt
import com.example.artspace.ui.screen.ArtDetailScreen
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtGallery()
                }
            }
        }
    }
}

@Composable
fun ArtGallery() {
    var currentIndex by remember { mutableStateOf(0) }
    val onNextClick = {
        currentIndex = (currentIndex + 1) % dummyArt.size
    }
    val onPreviousClick = {
        currentIndex = if (currentIndex == 0) dummyArt.size - 1 else currentIndex - 1
    }

    ArtDetailScreen(
        artData = dummyArt[currentIndex],
        onNextArt = onNextClick,
        onPreviousArt = onPreviousClick
    )
}