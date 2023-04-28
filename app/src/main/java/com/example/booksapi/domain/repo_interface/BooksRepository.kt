package com.example.booksapi.domain.repo_interface

import com.example.booksapi.domain.models.BooksLibrary
import com.example.booksapi.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface BooksRepository {
         fun getBooks(
            query: String,
            maxResult: Int
        ): Flow<Resource<List<BooksLibrary>>>
}
