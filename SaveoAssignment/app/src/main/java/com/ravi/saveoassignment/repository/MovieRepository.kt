package com.ravi.saveoassignment.repository

import com.example.guessmyage.Remote.apiClient
import com.example.itunesusingmvvm.Models.Netrork.API.Network
import com.example.itunesusingmvvm.Models.Netrork.API.Resource
import com.example.itunesusingmvvm.Models.Netrork.API.ResponseHandler
import com.ravi.saveoassignment.model.MovieModel
import com.ravi.saveoassignment.newModel.ResponseModel
import retrofit2.Response

class MovieRepository {

    val api = Network.getInstance()
        .create(apiClient::class.java)
    val responseHandler = ResponseHandler()

    suspend fun getMovieList():Resource<ResponseModel>{
            val data=api.getMovieListComedy()
            return responseHandler.handleSuccess(data)
        }
    }
