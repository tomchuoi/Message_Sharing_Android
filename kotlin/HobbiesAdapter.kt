package com.luckyshrine.messagesharing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.ViewHolder>() {
    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        private val txvTitle: TextView = itemView.findViewById(R.id.txvTitle) // Initialize txvTitle
        
        fun setData(hobby: Hobby?, pos: Int) {
            hobby?.let {
                itemView.findViewById<TextView>(R.id.txvTitle).text = it.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { // Creating view holder items
        val view = LayoutInflater.from(context).inflate(R.layout.list_layout, parent, false) // Return list_layout as a view
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }
}