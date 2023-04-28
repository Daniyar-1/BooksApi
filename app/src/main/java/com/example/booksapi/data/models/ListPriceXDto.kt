package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.ListPriceX
import com.google.gson.annotations.SerializedName

data class ListPriceXDto(
    @SerializedName("amountInMicros")
    var amountInMicros: Int? = null,
    @SerializedName("currencyCode")
    var currencyCode: String? = null
) : DataMapper<ListPriceX> {
    override fun toDomain() = ListPriceX(
        amountInMicros, currencyCode
    )
}