package com.example.superheroesapp.data

import com.example.superheroesapp.R
import com.example.superheroesapp.model.HeroEntity

object HeroesRepository {
    val heroes = listOf(
        HeroEntity(
            nameRes = R.string.hero1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.android_superhero1
        ),
        HeroEntity(
            nameRes = R.string.hero2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.android_superhero2
        ),
        HeroEntity(
            nameRes = R.string.hero3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.android_superhero3
        ),
        HeroEntity(
            nameRes = R.string.hero4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.android_superhero4
        ),
        HeroEntity(
            nameRes = R.string.hero5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.android_superhero5
        ),
        HeroEntity(
            nameRes = R.string.hero6,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.android_superhero6
        )
    )
}