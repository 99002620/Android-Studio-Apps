package com.example.myfragment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      val v=inflater.inflate(R.layout.fragment_first, container, false)

      val bt=v.findViewById<Button>(R.id.button2)
      bt.setOnClickListener{
          val secondFragment=SecondFragment()
          val transaction:FragmentTransaction=fragmentManager!!.beginTransaction()

          transaction.replace(R.id.MainActivity,secondFragment)

          transaction.commit()
      }

        return v
    }


}