package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myapplication1.R.id.list1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView=findViewById<TextView>(R.id.text1)
        val editTex=findViewById<EditText>(R.id.edit1)
        val button=findViewById<Button>(R.id.button)


        button?.setOnClickListener(){
            val edit=editTex.editableText
            Toast.makeText(this,edit, Toast.LENGTH_LONG ).show()
        }
        textView?.setOnClickListener() {
            Toast.makeText(this@MainActivity, R.string.message1, Toast.LENGTH_LONG).show()
        }

        val arrayAdapter:ArrayAdapter<*>
        val cricketers= arrayOf("sehwag","rohit","kohli")

        val myListView =findViewById<ListView>(list1)
        arrayAdapter= ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,cricketers)

        myListView.adapter=arrayAdapter

    }
}