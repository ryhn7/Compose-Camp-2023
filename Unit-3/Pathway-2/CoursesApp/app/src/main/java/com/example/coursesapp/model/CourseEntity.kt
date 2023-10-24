package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CourseEntity(
    @StringRes val nameCourse: Int,
    val quantityCourse: Int,
    @DrawableRes val imageCourse: Int
)