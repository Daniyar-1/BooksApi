package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class SearchInfo(
    @SerializedName("textSnippet")
    var textSnippet: String? = null
)