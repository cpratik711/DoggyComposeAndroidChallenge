package com.example.secondjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.secondjetpackcompose.repository.FakeDogDatabase
import com.pratik.doggycompose.compose_component.CharacterChip
import com.pratik.doggycompose.compose_component.HeightSpacer


@Composable
fun DogDetailScreen(navController: NavHostController, dogId: Int) {
    LazyColumn {
        /* Icon(modifier = Modifier.clickable {
             navController.navigateUp()
         }, imageVector = Icons.Filled.ArrowBack, contentDescription = null)*/
        val dog = FakeDogDatabase.dogList.first {
            it.id == dogId
        }
        item {
            Image(
                painter = painterResource(id = dog.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp))
            )
        }
        item {
            Column(Modifier.padding(16.dp)) {
                HeightSpacer(space = 10.dp)
                Text(
                    text = dog.name,
                    style = MaterialTheme.typography.h4,
                    fontWeight = FontWeight.Bold
                )
                HeightSpacer(space = 10.dp)
                Text(
                    text = dog.age.toString() + " years old",
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.SemiBold
                )
                HeightSpacer(space = 10.dp)
                Text(text = dog.about)

            }
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CharacterChip(character = "Color: " + dog.color)
                CharacterChip(character = "Gender:" + dog.gender)
                CharacterChip(character = "Breed: " + dog.breedName)
            }
        }

        item {
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Adopt me")
                }
            }
        }
    }
}


