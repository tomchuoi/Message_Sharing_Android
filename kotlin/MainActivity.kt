package com.luckyshrine.messagesharing

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luckyshrine.messagesharing.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!") // Appears only to the developer
            Toast.makeText(this@MainActivity, "Button was clicked", Toast.LENGTH_SHORT).show()

        }

        binding.buttonSendMsg.setOnClickListener{// After clicking this button, it will connect to second activity
            val message: String = binding.editUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}

