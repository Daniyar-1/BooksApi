package com.example.booksapi.data.repository

import com.example.booksapi.data.base.BaseRepository
import com.example.booksapi.data.remote.BooksApiService
import com.example.booksapi.domain.models.BooksLibrary
import com.example.booksapi.domain.repo_interface.BooksRepository
import com.example.booksapi.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

class BooksRepositoryImpl(
    private val bookService: BooksApiService
) : BooksRepository, BaseRepository() {
    override fun getBooks(
        query: String,
        maxResult: Int
    ): Flow<Resource<List<BooksLibrary>>> = doReguest {
        bookService.bookSearch(query, maxResult).map { it.toDomain() }
    }
}

