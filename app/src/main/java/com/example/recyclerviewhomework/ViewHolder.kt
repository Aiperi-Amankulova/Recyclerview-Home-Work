package com.example.recyclerviewhomework

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vertical_rv.view.*

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    fun fillet(qwerty: String){
        itemView.tvVertical.text=qwerty
    }
}