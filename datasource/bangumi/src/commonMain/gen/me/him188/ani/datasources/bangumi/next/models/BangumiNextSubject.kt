/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package me.him188.ani.datasources.bangumi.next.models

import kotlinx.serialization.Required
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param airtime
 * @param collection
 * @param eps
 * @param id
 * @param infobox
 * @param locked
 * @param metaTags
 * @param name
 * @param nameCN
 * @param nsfw
 * @param platform
 * @param rating
 * @param redirect
 * @param series
 * @param seriesEntry
 * @param summary
 * @param tags
 * @param type
 * @param volumes
 * @param images 
 */
@Serializable

data class BangumiNextSubject(

    @SerialName(value = "airtime") @Required val airtime: BangumiNextSubjectAirtime,

    @SerialName(value = "collection") @Required val collection: kotlin.collections.Map<kotlin.String, kotlin.Int>,

    @SerialName(value = "eps") @Required val eps: kotlin.Int,

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "infobox") @Required val infobox: kotlin.collections.List<BangumiNextInfoboxItem>,

    @SerialName(value = "locked") @Required val locked: kotlin.Boolean,

    @SerialName(value = "metaTags") @Required val metaTags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "nameCN") @Required val nameCN: kotlin.String,

    @SerialName(value = "nsfw") @Required val nsfw: kotlin.Boolean,

    @SerialName(value = "platform") @Required val platform: BangumiNextSubjectPlatform,

    @SerialName(value = "rating") @Required val rating: BangumiNextSubjectRating,

    @SerialName(value = "redirect") @Required val redirect: kotlin.Int,

    @SerialName(value = "series") @Required val series: kotlin.Boolean,

    @SerialName(value = "seriesEntry") @Required val seriesEntry: kotlin.Int,

    @SerialName(value = "summary") @Required val summary: kotlin.String,

    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<BangumiNextSubjectTag>,

    @SerialName(value = "type") @Required val type: Int,

    @SerialName(value = "volumes") @Required val volumes: kotlin.Int,

    @SerialName(value = "images") val images: BangumiNextSubjectImages? = null

)

