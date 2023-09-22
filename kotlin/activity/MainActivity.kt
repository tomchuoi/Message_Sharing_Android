package com.luckyshrine.messagesharing

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luckyshrine.messagesharing.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            Log.i(TAG, "Button was clicked!") // Appears only to the developer
        }

        binding.buttonSendMsg.setOnClickListener{// After clicking this button, it will connect to second activity
            val message: String = binding.editUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }

        binding.buttonShare.setOnClickListener{// Share the text to other apps
           val message: String = binding.editUserMessage.text.toString()
           val intent = Intent()

           intent.action = Intent.ACTION_SEND
           intent.putExtra(Intent.EXTRA_TEXT, message)
           intent.type = "plain/text"

           startActivity(Intent.createChooser(intent, "Share to: "))
        }

        binding.buttonRecycleView.setOnClickListener { // Demo button for recycler view
           val intent = Intent(this, HobbiesActivity::class.java)
           startActivity(intent)
       }
    }
}

