package com.example.myfragment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_second, container, false)

        val bt1=v.findViewById<Button>(R.id.button)

        bt1.setOnClickListener(){
            val thirdFragment=ThirdFragment()
            val transaction:FragmentTransaction=fragmentManager!!.beginTransaction()
            transaction.replace(R.id.MainActivity,thirdFragment)
            transaction.commit()
        }

        return v
    }

}