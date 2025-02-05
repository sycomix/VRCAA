package cc.sovellus.vrcaa.api.models


import com.google.gson.annotations.SerializedName

data class Notification(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("details")
    val details: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("seen")
    val seen: Boolean,
    @SerializedName("senderUserId")
    val senderUserId: String,
    @SerializedName("type")
    val type: String
)