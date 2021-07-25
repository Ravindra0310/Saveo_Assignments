package com.ravi.saveoassignment.adapter

import com.ravi.saveoassignment.newModel.ResponseItem


interface OnClickOfItem {

    fun showDetails(responseItem: ResponseItem ,position:Int)
}