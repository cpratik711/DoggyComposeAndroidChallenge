package com.example.secondjetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun DogDetailScreen(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigateUp() }) {
            Text(text = "Please click me to go back")
        }
    }
}