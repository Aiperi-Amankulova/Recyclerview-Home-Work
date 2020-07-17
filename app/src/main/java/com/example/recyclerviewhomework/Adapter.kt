package com.example.recyclerviewhomework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val array2:ArrayList<Model>): RecyclerView.Adapter<Holder>() {

    override fun onCreateViewHolder(parent2: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent2.context).inflate(R.layout.vertical_rv,parent2,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return array2.size
    }

    override fun onBindViewHolder(holder1: Holder, position: Int) {
        val random =array2[position]
        holder1.bind(random)
    }

}