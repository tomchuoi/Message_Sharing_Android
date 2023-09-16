package com.luckyshrine.messagesharing

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luckyshrine.messagesharing.databinding.Activity2LayoutBinding

class SecondActivity: AppCompatActivity() {
    private  lateinit var binding: Activity2LayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2LayoutBinding.inflate(layoutInflater)
        val secondView = binding.root
        setContentView(secondView)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        Toast.makeText(this, "Message sent!", Toast.LENGTH_SHORT).show()

        binding.displayUserMessage.text = msg



    }
}