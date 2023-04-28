package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.RetailPrice
import com.google.gson.annotations.SerializedName

data class RetailPriceDto(
    @SerializedName("amountInMicros")
    var amountInMicros: Int? = null,
    @SerializedName("currencyCode")
    var currencyCode: String? = null
) : DataMapper<RetailPrice> {
    override fun toDomain() = RetailPrice(
        amountInMicros, currencyCode
    )
}