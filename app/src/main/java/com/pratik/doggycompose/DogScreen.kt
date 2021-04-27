package com.example.secondjetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pratik.doggycompose.model.Dog


@Composable
fun DogScreen(navController: NavHostController, dogList: List<Dog>) {
    LazyColumn() {
        items(dogList) {
            dogList.forEach {
                DogRow(
                    it
                )
            }
        }
    }
}


@Composable
fun DogRow(dog: Dog) {
    Column {
        Surface(modifier = Modifier.size(200.dp), color = Color.Red) {
        }
        Row {
            Text(text = "$dog.name")
            Text(text = "${dog.weight}")
        }
    }


}
