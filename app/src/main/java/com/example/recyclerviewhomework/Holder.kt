package com.example.recyclerviewhomework

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.horizontal_rv.view.*

class Holder (view2: View): RecyclerView.ViewHolder(view2) {
    fun bind(random:Model){
        itemView.img_ocean.setBackgroundResource(random.img_ocean)
        itemView.tvHorFirst.text= random.tvHorFirst
        itemView.tvHorSecond.text=random.tvHorSecond
        itemView.tvHorThird.text=random.tvHorThird
    }
}