package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.ReadingModes
import com.google.gson.annotations.SerializedName

data class ReadingModesDto(
    @SerializedName("image")
    var image: Boolean? = null,
    @SerializedName("text")
    var text: Boolean? = null
) : DataMapper<ReadingModes> {
    override fun toDomain() = ReadingModes(
        image, text
    )
}
