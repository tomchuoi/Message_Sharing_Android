package com.luckyshrine.messagesharing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.ViewHolder>() {
    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        private var current_hobby: Hobby? = null
        private var current_position: Int = 0

        init {
            itemView.findViewById<ImageView>(R.id.imgShare).setOnClickListener{
                // Safe call using ?.let{}
                current_hobby?.let {
                    val intent = Intent()
                    val message: String = "My hobby is" + current_hobby!!.title

                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "plain/text"

                    context.startActivity(Intent.createChooser(intent, "Share to: "))
                }
            }
        }
        
        fun setData(hobby: Hobby?, pos: Int) {
            hobby?.let {
                itemView.findViewById<TextView>(R.id.txvTitle).text = it.title
            }
        }
    }

    companion object {
        val TAG: String = HobbiesAdapter::class.java.simpleName
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
