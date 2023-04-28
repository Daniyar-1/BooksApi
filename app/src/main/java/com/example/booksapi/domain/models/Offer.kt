package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class Offer(
    @SerializedName("finskyOfferType")
    var finskyOfferType: Int? = 0,
    @SerializedName("listPrice")
    var listPrice: ListPriceX? = ListPriceX(),
    @SerializedName("retailPrice")
    var retailPrice: RetailPrice? = RetailPrice()
)