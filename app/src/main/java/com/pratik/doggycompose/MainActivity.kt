package com.pratik.doggycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.secondjetpackcompose.DogDetailScreen
import com.example.secondjetpackcompose.DogScreen
import com.example.secondjetpackcompose.repository.FakeDogDatabase
import com.pratik.doggycompose.ui.theme.DoggyComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DoggyComposeTheme {
                Navigation()
            }
        }
    }
}


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.HOME) {
        composable(Screens.HOME) {
            DogScreen(navController, FakeDogDatabase.dogList)
        }
        composable(Screens.DETAIL) {
            DogDetailScreen(navController)
        }
    }
}
