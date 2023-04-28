package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class ImageLinks(
    @SerializedName("smallThumbnail")
    var smallThumbnail: String? = null,
    @SerializedName("thumbnail")
    var thumbnail: String? = null
)