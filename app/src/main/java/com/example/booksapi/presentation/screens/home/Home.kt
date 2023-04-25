package com.example.booksapi.presentation.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.booksapi.domain.BooksUiState
import com.example.booksapi.presentation.models.Books
import com.example.booksapi.presentation.screens.error.ErrorScreen
import com.example.booksapi.presentation.screens.loading.LoadingScreen

val list: ArrayList<Books> = arrayListOf()

@Composable
fun HomeScreen(
    booksUiState: BooksUiState,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier,
    onBookClicked: (Books) -> Unit
) {
    when (booksUiState) {
        is BooksUiState.Loading -> LoadingScreen(modifier)
        is BooksUiState.Error -> ErrorScreen(retryAction)
        is BooksUiState.Success -> HomeContent(
            list,
            onBookClicked
        )
    }
}