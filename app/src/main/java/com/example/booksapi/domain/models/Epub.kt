package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class Epub(
    @SerializedName("acsTokenLink")
    var acsTokenLink: String? = null,
    @SerializedName("isAvailable")
    var isAvailable: Boolean? = null
)