package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.AccessInfo
import com.google.gson.annotations.SerializedName

data class AccessInfoDto(
    @SerializedName("accessViewStatus")
    var accessViewStatus: String? = null,
    @SerializedName("country")
    var country: String? = null,
    @SerializedName("embeddable")
    var embeddable: Boolean? = null,
    @SerializedName("epub")
    var epubDto: EpubDto? = null,
    @SerializedName("pdf")
    var pdfDto: PdfDto? = null,
    @SerializedName("publicDomain")
    var publicDomain: Boolean? = null,
    @SerializedName("quoteSharingAllowed")
    var quoteSharingAllowed: Boolean? = null,
    @SerializedName("textToSpeechPermission")
    var textToSpeechPermission: String? = null,
    @SerializedName("viewability")
    var viewability: String? = null,
    @SerializedName("webReaderLink")
    var webReaderLink: String? = null
) : DataMapper<AccessInfo> {
    override fun toDomain() = AccessInfo(
        accessViewStatus,
        country,
        embeddable,
        epubDto?.toDomain(),
        pdfDto?.toDomain(),
        publicDomain,
        quoteSharingAllowed,
        textToSpeechPermission,
        viewability,
        webReaderLink
    )
}