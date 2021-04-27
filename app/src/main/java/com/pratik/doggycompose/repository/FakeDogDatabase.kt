package com.example.secondjetpackcompose.repository

import com.pratik.doggycompose.R
import com.pratik.doggycompose.model.Dog

object FakeDogDatabase {

    val about =
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"


    val dog = Dog(
        0,
        "Hachiko",
        3.5,
        "Male",
        "Brown",
        12.9,
        "389m away",
        R.drawable.dog1,
        about,
        "terrier-yorkshire"
    )

    // val owner = Owner("Spikey Sanju", "Developer & Pet Lover", R.drawable.owner)
    val dogList = listOf(dog, dog, dog, dog, dog, dog)
}