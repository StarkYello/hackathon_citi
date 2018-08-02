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
        val requestCode = System.currentTimeMillis().toInt()
        val intent = Intent(this, LoadingActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        val notificationIntent = PendingIntent.getActivity(this, requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        val mBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notification)
                .setContentTitle("TRAVEL SUITE")
                .setContentText("Out of Country? Use Travel Suite")
                .setContentIntent(notificationIntent)
        val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManager.notify(1, mBuilder.build())


//        val notificationIntent = Intent(this, SimpleActivity::class.java)
//        val contentIntent = PendingIntent.getActivity(this,
//                0, notificationIntent,
//                PendingIntent.FLAG_CANCEL_CURRENT)
//
//        val nm = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//
//        val res = resources
//        val builder = NotificationCompat.Builder(this)
//        builder.setContentIntent(contentIntent)
//                .setSmallIcon(R.drawable.notification)
//                .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.notification))
////                .setTicker(payload)
//                .setWhen(System.currentTimeMillis())
//                .setAutoCancel(true)
//                .setContentTitle("Message")
//                .setContentText("Out of Country? Would you like to use Citi Travel Suite")
//        val n = builder.notification
//        n.defaults = n.defaults or Notification.DEFAULT_ALL
//        nm.notify(0, n)
    }
}
