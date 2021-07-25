package com.ravi.saveoassignment.Activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ravi.saveoassignment.R
import com.ravi.saveoassignment.adapter.BottomAdapter
import com.ravi.saveoassignment.adapter.TopAdapter
import com.ravi.saveoassignment.model.MovieModelItem
import com.ravi.saveoassignment.newModel.ResponseItem
import com.ravi.saveoassignment.repository.MovieRepository
import com.ravi.saveoassignment.viewmodel.MovieViewModel
import com.ravi.saveoassignment.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*


class MovieHomeActivity : AppCompatActivity() {
    private lateinit var listViewModel: MovieViewModel
    private lateinit var listAdapter: BottomAdapter
    private lateinit var listAdapterTop: TopAdapter
    var dataModelList = mutableListOf<ResponseItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository by lazy {
            MovieRepository()
        }

        val factory = ViewModelFactory(repository)
        listViewModel = ViewModelProvider(this, factory).get(MovieViewModel::class.java)

        observerData()
        setRecyclerAdapter()
    }

    private fun observerData() {
        listViewModel.movieLiveData().observe(this, Observer {
            dataModelList.clear()
            dataModelList.addAll(it)
            listAdapter.notifyDataSetChanged()
            listAdapterTop.notifyDataSetChanged()

        })
    }

    private fun setRecyclerAdapter() {
        listAdapter = BottomAdapter(dataModelList)
        val layoutManager = GridLayoutManager(this,3,GridLayoutManager.VERTICAL,false)
        recyclerViewBottom.apply {
            this.layoutManager = layoutManager
            adapter = listAdapter
        }

        listAdapterTop= TopAdapter(dataModelList)
        recyclerViewTop.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewTop.adapter=listAdapterTop

    }


}