package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class ReadingModes(
    @SerializedName("image")
    var image: Boolean? = null,
    @SerializedName("text")
    var text: Boolean? = null
)