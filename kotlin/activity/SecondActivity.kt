package com.luckyshrine.messagesharing

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luckyshrine.messagesharing.databinding.Activity2LayoutBinding

class SecondActivity: AppCompatActivity() {
    private  lateinit var binding: Activity2LayoutBinding

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2LayoutBinding.inflate(layoutInflater)
        val secondView = binding.root
        setContentView(secondView)

        val bundle: Bundle? = intent.extras
        bundle?.let{
            val msg = bundle!!.getString(Constants.USER_MSG_KEY)
            showMessage("Message sent!")
            binding.displayUserMessage.text = msg
        }
    }
}
