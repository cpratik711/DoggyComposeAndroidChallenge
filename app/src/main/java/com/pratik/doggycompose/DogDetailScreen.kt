package com.example.secondjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.secondjetpackcompose.repository.FakeDogDatabase


@Composable
fun DogDetailScreen(navController: NavHostController, dogId: Int) {
    Column(Modifier.padding(16.dp)) {
        Icon(modifier = Modifier.clickable {
            navController.navigateUp()
        }, imageVector = Icons.Filled.ArrowBack, contentDescription = null)
        val dog = FakeDogDatabase.dogList.first {
            it.id == dogId
        }
        Image(
            painter = painterResource(id = dog.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )

        Text(text = dog.name, style = MaterialTheme.typography.h3)
        Text(text = dog.age.toString())
        Text(text = dog.about)

    }
}


