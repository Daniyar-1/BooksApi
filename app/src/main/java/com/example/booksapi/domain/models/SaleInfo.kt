package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class SaleInfo(
    @SerializedName("buyLink")
    var buyLink: String? = "",
    @SerializedName("country")
    var country: String? = "",
    @SerializedName("isEbook")
    var isEbook: Boolean? = false,
    @SerializedName("listPrice")
    var listPrice: ListPrice? = ListPrice(),
    @SerializedName("offers")
    var offers: List<Offer>? = listOf(),
    @SerializedName("retailPrice")
    var retailPrice: RetailPriceX? = RetailPriceX(),
    @SerializedName("saleability")
    var saleability: String? = ""
)