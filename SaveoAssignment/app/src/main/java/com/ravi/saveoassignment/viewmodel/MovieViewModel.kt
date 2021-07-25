package com.ravi.saveoassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ravi.saveoassignment.newModel.ResponseModel
import com.ravi.saveoassignment.repository.MovieRepository
import kotlinx.coroutines.Dispatchers

class MovieViewModel(val respository: MovieRepository) : ViewModel() {


    fun movieLiveData(): LiveData<ResponseModel>{
        return liveData(Dispatchers.IO){
            val result=respository.getMovieList()
            emit(result.data!!)
        }
    }
}