package com.example.booksapi.domain

import com.example.booksapi.data.models.Books


sealed interface BooksUiState {
    data class Success(val bookSearch: List<Books>) : BooksUiState
    object Error : BooksUiState
    object Loading : BooksUiState
}
