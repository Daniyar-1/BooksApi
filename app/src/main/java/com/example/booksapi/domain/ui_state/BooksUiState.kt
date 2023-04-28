package com.example.booksapi.domain.ui_state


sealed class BooksUiState<T>{
    class Loading<T>: BooksUiState<T>()
    class Success<T>(val data: T): BooksUiState<T>()
    class Error<T>(val message: String): BooksUiState<T>()
    class Empty<T>: BooksUiState<T>()
}
