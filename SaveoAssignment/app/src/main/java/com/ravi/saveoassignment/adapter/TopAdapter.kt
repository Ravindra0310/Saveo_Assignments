package com.ravi.saveoassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ravi.saveoassignment.R
import com.ravi.saveoassignment.newModel.ResponseItem
import kotlinx.android.synthetic.main.top_item.view.*

class TopAdapter (private var dataList: List<ResponseItem>,
) : RecyclerView.Adapter<TopAdapter.TopViewHolder>() {

    class TopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(responseItem: ResponseItem) {
            Glide.with(itemView.ivTop).load(responseItem.image.medium)
                .into(itemView.ivTop)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.top_item, parent, false)
        return TopViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopViewHolder, position: Int) {
        holder.setData(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}