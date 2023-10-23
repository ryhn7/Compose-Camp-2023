package com.example.artspace.ui.data

import com.example.artspace.R

data class ArtData(
    val image: Int,
    val title: String,
    val artist: String,
    val year: String
)

val dummyArt = listOf(
    ArtData(
        image = R.drawable.artspace1,
        title = "The Starry Night",
        artist = "Vincent van Gogh",
        year = "(1889)"
    ),
    ArtData(
        image = R.drawable.artspace2,
        title = "The Scream",
        artist = "Edvard Munch",
        year = "(1893)"
    ),
    ArtData(
        image = R.drawable.artspace3,
        title = "Palace of Versailles",
        artist = "Michelangelo",
        year = "(1512)"
    ),
    ArtData(
        image = R.drawable.artspace4,
        title = "Flower Still Life with a Timepiece",
        artist = "Willem van Aelst",
        year = "(1663)",
    ),
)
