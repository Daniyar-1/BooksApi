package com.example.booksapi.data.models


import com.example.booksapi.data.mapper.DataMapper
import com.example.booksapi.domain.models.PanelizationSummary
import com.google.gson.annotations.SerializedName

data class PanelizationSummaryDto(
    @SerializedName("containsEpubBubbles")
    var containsEpubBubbles: Boolean? = null,
    @SerializedName("containsImageBubbles")
    var containsImageBubbles: Boolean? = null
) : DataMapper<PanelizationSummary> {
    override fun toDomain() = PanelizationSummary(
        containsEpubBubbles, containsImageBubbles
    )
}