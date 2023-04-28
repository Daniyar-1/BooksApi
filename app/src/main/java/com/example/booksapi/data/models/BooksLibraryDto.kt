package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.BooksLibrary
import com.google.gson.annotations.SerializedName

data class BooksLibraryDto(
    @SerializedName("items")
    var itemDtos: List<ItemDto> = listOf(),
    @SerializedName("kind")
    var kind: String? = "",
    @SerializedName("totalItems")
    var totalItems: Int? = 0
) : DataMapper<BooksLibrary> {
    override fun toDomain() = BooksLibrary(
        itemDtos.map { it.toDomain() }, kind, totalItems
    )
}