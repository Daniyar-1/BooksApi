package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.Epub
import com.google.gson.annotations.SerializedName

data class EpubDto(
    @SerializedName("acsTokenLink")
    var acsTokenLink: String? = null,
    @SerializedName("isAvailable")
    var isAvailable: Boolean? = null
) : DataMapper<Epub> {
    override fun toDomain() = Epub(
        acsTokenLink,
        isAvailable
    )
}