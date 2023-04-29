package com.example.booksapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.booksapi.domain.models.Item
import com.example.booksapi.presentation.objects.Screen
import com.example.booksapi.presentation.screens.home.HomeScreen

@Composable
fun Navigation(onBookClicked: (Item) -> Unit) {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            HomeScreen(retryAction = { }, onBookClicked = onBookClicked)
        }
        composable(Screen.DetailScreen.route) {
            //No book read mode
        }
    }
}
