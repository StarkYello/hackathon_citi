package com.intern.xing.hackathon_citi

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat

class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.gold)))
        supportActionBar!!.title = "Accounts"
//        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(resources.getDrawable(R.drawable.sandwich))



        val requestCode = System.currentTimeMillis().toInt()
        val intent = Intent(this, LoadingActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        val notificationIntent = PendingIntent.getActivity(this, requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val mBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notification)
                .setContentTitle("TRAVEL SUITE")
                .setContentText("Out of Country? Use Travel Suite")
                .setContentIntent(notificationIntent)
                .setAutoCancel(true)
        val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManager.notify(requestCode, mBuilder.build())
    }
}
