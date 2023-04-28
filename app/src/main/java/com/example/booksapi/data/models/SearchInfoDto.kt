package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.SearchInfo
import com.google.gson.annotations.SerializedName

data class SearchInfoDto(
    @SerializedName("textSnippet")
    var textSnippet: String? = null
) : DataMapper<SearchInfo> {
    override fun toDomain() = SearchInfo(
        textSnippet
    )
}