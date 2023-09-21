package com.luckyshrine.messagesharing

import android.app.Activity
import android.content.Context
import android.widget.Toast
import java.time.Duration

fun Context.showMessage (message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}