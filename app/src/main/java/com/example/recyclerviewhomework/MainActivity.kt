package com.example.recyclerviewhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var horizontalRV: RecyclerView? =null
    private var verticalRV: RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        adapter()
    }
    private fun initView(){
        horizontalRV = findViewById(R.id.horizontalRV)
        verticalRV =findViewById(R.id.verticalRV)
    }
    private fun adapter(){
        val page = arrayListOf<String>()
        for (pageVer in 0 ..50) {
            page.add("number $pageVer")
        }
        val adapter = AdapterInFirstPage(page)
        horizontalRV?.adapter=adapter


        val page2 = arrayListOf<Model>()
        for (pageHor in 0..100) {
            page2.add(Model(R.drawable.ocean,"Ocean $pageHor","1 $pageHor","100 $pageHor" ))
        }

        val adapter1= Adapter(page2)
        verticalRV?.adapter=adapter1
    }
}