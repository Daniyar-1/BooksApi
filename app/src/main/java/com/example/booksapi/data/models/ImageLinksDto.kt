package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.ImageLinks
import com.google.gson.annotations.SerializedName

data class ImageLinksDto(
    @SerializedName("smallThumbnail")
    var smallThumbnail: String? = null,
    @SerializedName("thumbnail")
    var thumbnail: String? = null
) : DataMapper<ImageLinks> {
    override fun toDomain() = ImageLinks(
        smallThumbnail, thumbnail
    )
}