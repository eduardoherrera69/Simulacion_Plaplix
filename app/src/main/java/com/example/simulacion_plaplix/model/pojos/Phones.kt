package com.example.simulacion_plaplix.model.pojos


import com.google.gson.annotations.SerializedName

data class Phones(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: Int
)