package com.luckyshrine.messagesharing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luckyshrine.messagesharing.databinding.HobbyLayoutBinding

class HobbiesActivity: AppCompatActivity() {
    private lateinit var binding: HobbyLayoutBinding
    private lateinit var recyclerView: RecyclerView

    companion object {
        val TAG: String = HobbiesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HobbyLayoutBinding.inflate(layoutInflater)
        recyclerView = binding.RecycleView

        val hobbyView = binding.root
        setContentView(hobbyView)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Data.hobbies)
        recyclerView.adapter = adapter


    }
}
