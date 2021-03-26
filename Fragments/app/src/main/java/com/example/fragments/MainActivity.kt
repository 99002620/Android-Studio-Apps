package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1=findViewById<Button>(R.id.button1)

        // Set a click listener for first button widget
        button1.setOnClickListener {
            // Get the text fragment instance
            val textFragment = TextFragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,textFragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }

        val button2=findViewById<Button>(R.id.button2)


        // Set a click listener for second button widget
        button2.setOnClickListener {
            // Get the text fragment instance
            val imageFragment = ImageFragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,imageFragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }
    }
}