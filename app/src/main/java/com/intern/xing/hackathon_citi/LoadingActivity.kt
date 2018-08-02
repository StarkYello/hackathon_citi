package com.intern.xing.hackathon_citi

import android.app.Notification
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.BitmapFactory
import androidx.core.app.NotificationCompat
import android.content.Context.NOTIFICATION_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.app.Activity





class LoadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.gold)))
        supportActionBar!!.title = "Travel Suite"




    }
}
