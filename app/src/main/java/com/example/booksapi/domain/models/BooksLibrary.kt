package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class BooksLibrary(
    @SerializedName("items")
    var items: List<Item> = listOf(),
    @SerializedName("kind")
    var kind: String? = "",
    @SerializedName("totalItems")
    var totalItems: Int? = 0
)