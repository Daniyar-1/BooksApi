package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.Pdf
import com.google.gson.annotations.SerializedName

data class PdfDto(
    @SerializedName("acsTokenLink")
    var acsTokenLink: String? = null,
    @SerializedName("isAvailable")
    var isAvailable: Boolean? = null
) : DataMapper<Pdf> {
    override fun toDomain() = Pdf(
        acsTokenLink,
        isAvailable
    )
}