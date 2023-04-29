package com.example.booksapi.presentation.vm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.example.booksapi.domain.ui_state.BooksUiState
import com.example.booksapi.domain.use_case.GetAllBooksUseCase
import com.example.booksapi.presentation.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class HomeVM(
    private val getAllBooksUseCase: GetAllBooksUseCase
) : BaseViewModel() {

    private val _getAllBooksUseCase =
        MutableStateFlow<BooksUiState>(BooksUiState.Loading)
    val getAllBooksStateFlow = _getAllBooksUseCase

    init {
        getAllBooks()
    }
     fun getAllBooks(query: String = "book", maxResult: Int = 10) {
        getAllBooksUseCase.getAllBooks(query, maxResult).collectFlow(_getAllBooksUseCase)
    }

    private val _searchWidgetState: MutableState<SearchWidgetState> =
        mutableStateOf(value = SearchWidgetState.CLOSED)
    val searchWidgetState: State<SearchWidgetState> = _searchWidgetState

    private val _searchTextState: MutableState<String> =
        mutableStateOf(value = "")
    val searchTextState: State<String> = _searchTextState

    fun updateSearchWidgetState(newValue: SearchWidgetState) {
        _searchWidgetState.value = newValue
    }

    fun updateSearchTextState(newValue: String) {
        _searchTextState.value = newValue
    }
}
enum class SearchWidgetState {
    OPENED,
    CLOSED
}