package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.RetailPriceX
import com.google.gson.annotations.SerializedName

data class RetailPriceXDto(
    @SerializedName("amount")
    var amount: Double? = null,
    @SerializedName("currencyCode")
    var currencyCode: String? = null
) : DataMapper<RetailPriceX> {
    override fun toDomain() = RetailPriceX(
        amount, currencyCode
    )
}