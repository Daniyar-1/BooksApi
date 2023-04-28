package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.SaleInfo
import com.google.gson.annotations.SerializedName

data class SaleInfoDto(
    @SerializedName("buyLink")
    var buyLink: String? = "",
    @SerializedName("country")
    var country: String? = "",
    @SerializedName("isEbook")
    var isEbook: Boolean? = false,
    @SerializedName("listPrice")
    var listPriceDto: ListPriceDto? = ListPriceDto(),
    @SerializedName("offers")
    var offerDtos: List<OfferDto>? = listOf(),
    @SerializedName("retailPrice")
    var retailPrice: RetailPriceXDto? = RetailPriceXDto(),
    @SerializedName("saleability")
    var saleability: String? = ""
) : DataMapper<SaleInfo> {
    override fun toDomain() = SaleInfo(
        buyLink,
        country,
        isEbook,
        listPriceDto?.toDomain(),
        offerDtos?.map { it.toDomain() },
        retailPrice?.toDomain(),
        saleability
    )
}