package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.VolumeInfo
import com.google.gson.annotations.SerializedName

data class VolumeInfoDto(
    @SerializedName("allowAnonLogging") var allowAnonLogging: Boolean? = null,
    @SerializedName("authors") var authors: List<String?>? = null,
    @SerializedName("averageRating") var averageRating: Double? = null,
    @SerializedName("canonicalVolumeLink") var canonicalVolumeLink: String? = null,
    @SerializedName("categories") var categories: List<String?>? = null,
    @SerializedName("contentVersion") var contentVersion: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("imageLinks") var imageLinksDto: ImageLinksDto? = null,
    @SerializedName("industryIdentifiers") var industryIdentifierDtos: List<IndustryIdentifierDto>? = listOf(),
    @SerializedName("infoLink") var infoLink: String? = null,
    @SerializedName("language") var language: String? = null,
    @SerializedName("maturityRating") var maturityRating: String? = null,
    @SerializedName("pageCount") var pageCount: Int? = null,
    @SerializedName("panelizationSummary") var panelizationSummaryDto: PanelizationSummaryDto? = null,
    @SerializedName("previewLink") var previewLink: String? = null,
    @SerializedName("printType") var printType: String? = null,
    @SerializedName("publishedDate") var publishedDate: String? = null,
    @SerializedName("publisher") var publisher: String? = null,
    @SerializedName("ratingsCount") var ratingsCount: Int? = null,
    @SerializedName("readingModes") var readingModesDto: ReadingModesDto? = null,
    @SerializedName("subtitle") var subtitle: String? = null,
    @SerializedName("title") var title: String? = null
) : DataMapper<VolumeInfo> {
    override fun toDomain() = VolumeInfo(
        allowAnonLogging,
        authors,
        averageRating,
        canonicalVolumeLink,
        categories,
        contentVersion,
        description,
        imageLinksDto?.toDomain(),
        industryIdentifierDtos?.map { it.toDomain() },
        infoLink,
        language,
        maturityRating,
        pageCount,
        panelizationSummaryDto?.toDomain(),
        previewLink,
        printType,
        publishedDate,
        publisher,
        ratingsCount,
        readingModesDto?.toDomain(),
        subtitle,
        title
    )
}