package com.example.artspace.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.R
import com.example.artspace.ui.data.ArtData

@Composable
fun ArtDetailScreen(
    artData: ArtData,
    onNextArt: () -> Unit,
    onPreviousArt: () -> Unit
) {
    BaseScreen(
        image = artData.image,
        title = artData.title,
        artist = artData.artist,
        year = artData.year,
        onNextArt = onNextArt,
        onPreviousArt = onPreviousArt,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color(0xFFfefbff))
    )
}

@Composable
@Preview(showBackground = true)
fun ArtDetailScreenPreview() {
    ArtDetailScreen(
        artData = ArtData(
            image = R.drawable.artspace1,
            title = "The Starry Night",
            artist = "Vincent van Gogh",
            year = "1889"
        ),
        onNextArt = {},
        onPreviousArt = {}
    )
}