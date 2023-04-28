package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.Item
import com.google.gson.annotations.SerializedName

data class ItemDto(
    @SerializedName("accessInfo")
    var accessInfoDto: AccessInfoDto? = AccessInfoDto(),
    @SerializedName("etag")
    var etag: String? = null,
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("kind")
    var kind: String? = null,
    @SerializedName("saleInfo")
    var saleInfoDto: SaleInfoDto? = SaleInfoDto(),
    @SerializedName("searchInfo")
    var searchInfo: SearchInfoDto? = SearchInfoDto(),
    @SerializedName("selfLink")
    var selfLink: String? = null,
    @SerializedName("volumeInfo")
    var volumeInfoDto: VolumeInfoDto? = VolumeInfoDto()
) : DataMapper<Item> {
    override fun toDomain() = Item(
        accessInfoDto?.toDomain(),
        etag,
        id,
        kind,
        saleInfoDto?.toDomain(),
        searchInfo?.toDomain(),
        selfLink,
        volumeInfoDto?.toDomain()
    )
}