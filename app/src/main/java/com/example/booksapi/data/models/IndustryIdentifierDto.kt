package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.IndustryIdentifier
import com.google.gson.annotations.SerializedName

data class IndustryIdentifierDto(
    @SerializedName("identifier")
    var identifier: String? = null,
    @SerializedName("type")
    var type: String? = null
) : DataMapper<IndustryIdentifier> {
    override fun toDomain() = IndustryIdentifier(
        identifier, type
    )
}