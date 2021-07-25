package com.ravi.saveoassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ravi.saveoassignment.R
import com.ravi.saveoassignment.model.MovieModel
import com.ravi.saveoassignment.model.MovieModelItem
import com.ravi.saveoassignment.model.Show
import com.ravi.saveoassignment.newModel.ResponseItem
import kotlinx.android.synthetic.main.bottom_item.view.*

class BottomAdapter(
    private var dataList: List<ResponseItem>,
) : RecyclerView.Adapter<BottomAdapter.BottomViewHolder>() {

    class BottomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(responseItem:  ResponseItem) {
            Glide.with(itemView.ivBottomItem).load(responseItem.image.medium)
                .into(itemView.ivBottomItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BottomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bottom_item, parent, false)
        return BottomViewHolder(view)
    }

    override fun onBindViewHolder(holder: BottomViewHolder, position: Int) {
        holder.setData(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}