package com.ravi.saveoassignment.newModel


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("timezone")
    var timezone: String
)