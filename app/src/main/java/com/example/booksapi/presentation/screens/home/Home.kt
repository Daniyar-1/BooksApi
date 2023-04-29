package com.example.booksapi.presentation.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.booksapi.domain.models.Item
import com.example.booksapi.domain.ui_state.BooksUiState
import com.example.booksapi.presentation.screens.error.ErrorScreen
import com.example.booksapi.presentation.screens.loading.LoadingScreen
import com.example.booksapi.presentation.vm.HomeVM
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(
    retryAction: () -> Unit,
    modifier: Modifier = Modifier,
    onBookClicked: (Item) -> Unit,
) {
    val vm: HomeVM = koinViewModel()

    val booksUiState by vm.getAllBooksStateFlow.collectAsStateWithLifecycle()

    when (booksUiState) {
        is BooksUiState.Loading -> LoadingScreen(modifier)
        is BooksUiState.Error -> ErrorScreen(retryAction)
        is BooksUiState.Success -> HomeContent(
            vm,
            (booksUiState as BooksUiState.Success).data, onBookClicked = onBookClicked
        )
    }
}