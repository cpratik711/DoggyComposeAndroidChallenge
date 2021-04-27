package com.example.secondjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.pratik.doggycompose.Screens
import com.pratik.doggycompose.model.Dog


@Composable
fun DogScreen(navController: NavHostController, dogList: List<Dog>) {
    LazyColumn {
        item {
            TopAppBar(backgroundColor = Color.White) {
                Text(
                    modifier = Modifier
                        .padding(10.dp)
                        .wrapContentHeight()
                        .fillMaxWidth(),
                    text = "Doggy Compose",
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    style = MaterialTheme.typography.body1
                )
            }
        }
        items(dogList) {
            dogList.forEach {
                DogRow(
                    it, onItemClick = { dog ->
                        val dogPath = "${Screens.DETAIL}/${dog.id}"
                        navController.navigate(dogPath)
                    }
                )
            }
        }
    }
}

@Composable
fun DogRow(dog: Dog, onItemClick: (dog: Dog) -> Unit) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable {
            onItemClick(dog)
        }) {
        Row(Modifier.fillMaxSize()) {
            val roundedShape = RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp)
            Image(
                painter = painterResource(id = dog.image),
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Red, shape = roundedShape),
                contentDescription = null
            )
            Column(Modifier.padding(10.dp)) {
                Text(text = dog.name)
                Text(text = "${dog.weight}")
            }
        }
    }

}


@Preview
@Composable
fun Button() {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        Text(text = "Hello")
    }
}

