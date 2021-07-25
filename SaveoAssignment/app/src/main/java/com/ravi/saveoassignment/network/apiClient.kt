package com.example.guessmyage.Remote


import com.ravi.saveoassignment.model.MovieModel
import com.ravi.saveoassignment.newModel.ResponseModel
import retrofit2.http.*

interface apiClient {

    @GET("shows")
    suspend fun getMovieListComedy(@Query("page") number:Int): ResponseModel

    @GET("shows?page=2")
    suspend fun getMovieListAnimation(): ResponseModel

}