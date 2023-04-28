package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.Offer
import com.google.gson.annotations.SerializedName

data class OfferDto(
    @SerializedName("finskyOfferType")
    var finskyOfferType: Int? = 0,
    @SerializedName("listPrice")
    var listPrice: ListPriceXDto? = ListPriceXDto(),
    @SerializedName("retailPrice")
    var retailPriceDto: RetailPriceDto? = RetailPriceDto()
) : DataMapper<Offer> {
    override fun toDomain() = Offer(
        finskyOfferType, listPrice?.toDomain(), retailPriceDto?.toDomain()
    )
}