package com.example.myrecycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private var titles: List<String>,
    private var details: List<String>,
    private var images: List<Int>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemTitles: TextView = itemView.findViewById(R.id.title)
        val itemTitles1: TextView = itemView.findViewById(R.id.title1)
        val itemPicture: ImageView = itemView.findViewById(R.id.image1)

        init {
            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                Toast.makeText(
                    itemView.context,
                    "you clicked item ${position + 1}",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val  View =
            LayoutInflater.from(parent.context).inflate(R.layout.layout, parent, false)
        return ViewHolder(View)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemTitles.text = titles[position]
        holder.itemTitles.text = details[position]
        holder.itemPicture.setImageResource(images[position])
    }

    override fun getItemCount(): Int {

        return titles.size
    }
}
