package com.example.booksapi.domain.use_case

import com.example.booksapi.domain.repo_interface.BooksRepository

class GetAllBooksUseCase(private val repository: BooksRepository) {
fun getAllBooks( query: String, maxResult: Int) = repository.getBooks(query, maxResult )
}