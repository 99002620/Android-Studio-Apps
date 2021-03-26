package com.example.myadaptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import java.util.ArrayList
import java.util.HashMap

class MainActivity : AppCompatActivity() {
            private lateinit var listView: ListView
            private val fruitNames=arrayOf("Banana","Grape","Guava","Mango","Orange","Watermelon")

            private val fruitImageIds=arrayOf(R.drawable.banana,
                    R.drawable.grape,
                    R.drawable.guava,
                    R.drawable.mango,
                    R.drawable.orange,
                    R.drawable.watermelon)

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                listView=findViewById(R.id.listView)

                val list=ArrayList<HashMap<String,Any>>()

                for(i in fruitNames.indices){
                    val map=HashMap<String,Any>()

                    map["fruitName"] = fruitNames[i]
                    map["fruitImage"]=fruitImageIds[i]

                    // adding the HashMap to the ArrayList
                    list.add(map)
                }

                val from=arrayOf("fruitName","fruitImage")

                val to= intArrayOf(R.id.textView,R.id.imageView)

                val simpleAdapter= SimpleAdapter(this,list,R.layout.row_list,from,to)

                listView.adapter = simpleAdapter
            }
        }


