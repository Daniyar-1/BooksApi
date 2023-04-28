package com.example.booksapi.domain.models


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("accessInfo")
    var accessInfo: AccessInfo? = AccessInfo(),
    @SerializedName("etag")
    var etag: String? = null,
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("kind")
    var kind: String? = null,
    @SerializedName("saleInfo")
    var saleInfo: SaleInfo? = SaleInfo(),
    @SerializedName("searchInfo")
    var searchInfo: SearchInfo? = SearchInfo(),
    @SerializedName("selfLink")
    var selfLink: String? = null,
    @SerializedName("volumeInfo")
    var volumeInfo: VolumeInfo? = VolumeInfo()
)