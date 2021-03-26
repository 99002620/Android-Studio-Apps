package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private var titleList= mutableListOf<String>()
    private var detailsList= mutableListOf<String>()
    private var imageList= mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        val recyclerView=findViewById<RecyclerView>(R.id.rv_recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=RecyclerAdapter(titleList,detailsList,imageList)
    }
    private fun addTOList(title:String,title1:String,image1:Int){
        titleList.add(title)
        detailsList.add(title1)
        imageList.add(image1)

    }
    private fun postToList(){
        for(i in 1..25){
            addTOList("title $i","title1 $i", R.mipmap.ic_launcher)
        }
    }

}