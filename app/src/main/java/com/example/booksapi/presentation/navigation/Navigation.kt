package com.example.booksapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.booksapi.presentation.models.Books
import com.example.booksapi.presentation.objects.Screen
import com.example.booksapi.presentation.screens.home.HomeContent

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val listBooks: ArrayList<Books> = arrayListOf()
    NavHost(
        navController = navController, startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            listBooks.add(Books("Hello", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Chain_link_icon.png", "https://img.freepik.com/free-photo/book-composition-with-open-book_23-2147690555.jpg", "Blank"))
            listBooks.add(Books("Hello", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Chain_link_icon.png", "https://img.freepik.com/free-photo/book-composition-with-open-book_23-2147690555.jpg", "Blank"))
            listBooks.add(Books("Hello", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Chain_link_icon.png", "https://img.freepik.com/free-photo/book-composition-with-open-book_23-2147690555.jpg", "Blank"))
            listBooks.add(Books("Hello", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Chain_link_icon.png", "https://img.freepik.com/free-photo/book-composition-with-open-book_23-2147690555.jpg", "Blank"))
            listBooks.add(Books("Hello", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Chain_link_icon.png", "https://img.freepik.com/free-photo/book-composition-with-open-book_23-2147690555.jpg", "Blank"))
            listBooks.add(Books("Hello", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Chain_link_icon.png", "https://img.freepik.com/free-photo/book-composition-with-open-book_23-2147690555.jpg", "Blank"))
            HomeContent(listBooks, {})
        }
        composable(Screen.DetailScreen.route) {

        }
    }
}
