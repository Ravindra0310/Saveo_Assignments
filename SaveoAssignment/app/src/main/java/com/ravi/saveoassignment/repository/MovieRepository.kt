package com.ravi.saveoassignment.repository

import com.example.guessmyage.Remote.apiClient
import com.example.itunesusingmvvm.Models.Netrork.API.Network
import com.example.itunesusingmvvm.Models.Netrork.API.Resource
import com.example.itunesusingmvvm.Models.Netrork.API.ResponseHandler
import com.ravi.saveoassignment.model.MovieModel
import retrofit2.Response

class MovieRepository {

    val api = Network.getInstance()
        .create(apiClient::class.java)
    val responseHandler = ResponseHandler()



    suspend fun getMovieList(): Resource<MovieModel> {
        return try {
            val response=api.getMovieListComedy()
            responseHandler.handleSuccess(response)
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }
    suspend fun getMovieList2(): Resource<MovieModel> {
        return try {
            val response=api.getMovieListAnimation()
            responseHandler.handleSuccess(response)
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }
}