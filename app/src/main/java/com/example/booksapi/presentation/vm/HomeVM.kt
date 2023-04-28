package com.example.booksapi.presentation.vm

import com.example.booksapi.domain.ui_state.BooksUiState
import com.example.booksapi.domain.models.BooksLibrary
import com.example.booksapi.domain.use_case.GetAllBooksUseCase
import com.example.booksapi.presentation.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeVM(
    private val getAllBooksUseCase: GetAllBooksUseCase
) : BaseViewModel() {

    private val _getAllBooksUseCase =
        MutableStateFlow<BooksUiState<List<BooksLibrary>>>(BooksUiState.Empty())
    val getAllBooksUseCaseFlow = _getAllBooksUseCase.asStateFlow()

    fun getAllBooks(query: String, maxResult: Int) {
        getAllBooksUseCase.getAllBooks(query, maxResult).collectFlow(_getAllBooksUseCase)
    }
}