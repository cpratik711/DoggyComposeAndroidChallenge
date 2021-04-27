package com.pratik.doggycompose.model

import androidx.annotation.DrawableRes

data class Dog(
    val id: Int,
    val name: String,
    val age: Double,
    val gender: String,
    val color: String,
    val weight: Double,
    val location: String,
    @DrawableRes val image: Int,
    val about: String,
    val breedName: String = ""
)
