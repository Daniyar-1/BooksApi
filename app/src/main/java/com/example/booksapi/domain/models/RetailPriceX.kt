package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class RetailPriceX(
    @SerializedName("amount")
    var amount: Double? = null,
    @SerializedName("currencyCode")
    var currencyCode: String? = null
)