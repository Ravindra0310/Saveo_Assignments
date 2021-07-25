package com.ravi.saveoassignment.newModel


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("previousepisode")
    var previousepisode: Previousepisode,
    @SerializedName("self")
    var self: Self
)