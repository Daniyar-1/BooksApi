package com.example.booksapi.domain.ui_state

import com.example.booksapi.domain.models.BooksLibrary


sealed class BooksUiState {
    object Loading : BooksUiState()
    class Success(val data: List<BooksLibrary>) : BooksUiState()
    object Error : BooksUiState()
}