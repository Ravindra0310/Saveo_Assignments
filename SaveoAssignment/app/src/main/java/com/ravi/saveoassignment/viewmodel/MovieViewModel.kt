package com.ravi.saveoassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.itunesusingmvvm.Models.Netrork.API.Resource
import com.ravi.saveoassignment.model.MovieModel
import com.ravi.saveoassignment.repository.MovieRepository
import kotlinx.coroutines.Dispatchers

class MovieViewModel(private val respository: MovieRepository) : ViewModel() {


    fun movieLiveData(): LiveData<Resource<MovieModel>> {
        return liveData(Dispatchers.IO) {
            emit(Resource.loading(null))
            val data = respository.getMovieList()
            emit(data)
        }
    }
}