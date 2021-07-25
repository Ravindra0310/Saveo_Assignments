package com.ravi.saveoassignment.model


import com.google.gson.annotations.SerializedName

data class MovieModelItem(
    @SerializedName("score")
    var score: Double,
    @SerializedName("show")
    var show: Show
)