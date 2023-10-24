package com.example.coursesapp.data

import com.example.coursesapp.R
import com.example.coursesapp.model.CourseEntity

class DataSource {
    val courses = listOf(
        CourseEntity(R.string.architecture, 58, R.drawable.architecture),
        CourseEntity(R.string.crafts, 121, R.drawable.crafts),
        CourseEntity(R.string.business, 78, R.drawable.business),
        CourseEntity(R.string.culinary, 118, R.drawable.culinary),
        CourseEntity(R.string.design, 423, R.drawable.design),
        CourseEntity(R.string.fashion, 92, R.drawable.fashion),
        CourseEntity(R.string.film, 165, R.drawable.film),
        CourseEntity(R.string.gaming, 164, R.drawable.gaming),
        CourseEntity(R.string.drawing, 326, R.drawable.drawing),
        CourseEntity(R.string.lifestyle, 305, R.drawable.lifestyle),
        CourseEntity(R.string.music, 212, R.drawable.music),
        CourseEntity(R.string.painting, 172, R.drawable.painting),
        CourseEntity(R.string.photography, 321, R.drawable.photography),
        CourseEntity(R.string.tech, 118, R.drawable.tech)
    )
}