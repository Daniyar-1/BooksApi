package com.example.booksapi.presentation.objects

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArgs(title: String, desc: String): String {
        return buildString {
            append("$route/$title/$desc")
        }
    }

    fun withArgsObject(vararg data: String): String {
        return buildString {
            append(route)
            data.forEach {
                append("/$it")
            }
        }
    }
}

