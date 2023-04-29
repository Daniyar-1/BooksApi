package com.example.booksapi.data.remote

import com.example.booksapi.data.models.BooksLibraryDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApiService {
    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): BooksLibraryDto
}