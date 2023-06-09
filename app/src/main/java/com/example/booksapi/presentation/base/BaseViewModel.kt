package com.example.booksapi.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.booksapi.domain.models.BooksLibrary
import com.example.booksapi.domain.ui_state.BooksUiState
import com.example.booksapi.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

@Suppress("UNCHECKED_CAST")
abstract class BaseViewModel : ViewModel() {
    protected fun <T> Flow<Resource<T>>.collectFlow(_state: MutableStateFlow<BooksUiState>) {
        viewModelScope.launch(Dispatchers.IO) {
            this@collectFlow.collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _state.value = BooksUiState.Loading
                    }

                    is Resource.Success -> {
                        if (result.data != null) {
                            _state.value = BooksUiState.Success(result.data as List<BooksLibrary>)
                        }
                    }

                    is Resource.Error -> {
                        _state.value = BooksUiState.Error
                    }
                }
            }

        }
    }
}