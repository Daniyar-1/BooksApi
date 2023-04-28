package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.ListPrice
import com.google.gson.annotations.SerializedName

data class ListPriceDto(
    @SerializedName("amount")
    var amount: Double? = null,
    @SerializedName("currencyCode")
    var currencyCode: String? = null
) : DataMapper<ListPrice> {
    override fun toDomain() = ListPrice(
        amount, currencyCode
    )
}