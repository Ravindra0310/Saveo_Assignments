package com.example.guessmyage.Remote


import com.ravi.saveoassignment.model.MovieModel
import retrofit2.http.*

interface apiClient {

    @GET("search/shows?q=comedy")
    suspend fun getMovieListComedy(): MovieModel

    @GET("search/shows?q=Animation")
    suspend fun getMovieListAnimation(): MovieModel

}