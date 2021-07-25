package com.example.guessmyage.Remote


import com.ravi.saveoassignment.model.MovieModel
import com.ravi.saveoassignment.newModel.ResponseModel
import retrofit2.http.*

interface apiClient {

    @GET("shows?page=1")
    suspend fun getMovieListComedy(): ResponseModel

    @GET("shows?page=2")
    suspend fun getMovieListAnimation(): ResponseModel

}