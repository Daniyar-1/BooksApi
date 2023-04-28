package com.example.booksapi.data.models

import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.BooksDomainModel

data class BooksDataModel(
    val title: String?,
    val previewLink: String?,
    val imageLink: String?,
    val description: String?
) : DataMapper<BooksDomainModel> {
    override fun toDomain() = BooksDomainModel(
        title, previewLink, imageLink, description
    )
}