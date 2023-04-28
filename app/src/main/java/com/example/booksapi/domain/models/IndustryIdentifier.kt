package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class IndustryIdentifier(
    @SerializedName("identifier")
    var identifier: String? = null,
    @SerializedName("type")
    var type: String? = null
)