package com.example.myfragment

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity(R.id.MyFragment) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (savedInstanceState == null){
            val bundle = bundleOf("some_int" to 0)
            supportFragmentManager.commit{
                setReorderingAllowed(true)
                add<ExampleFragment>(R.id.fragment_container_view, bundle)
            }

        }
    }


}