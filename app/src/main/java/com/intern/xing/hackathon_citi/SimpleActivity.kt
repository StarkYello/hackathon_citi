package com.intern.xing.hackathon_citi

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.gold)))
        supportActionBar!!.title = "Accounts"
//        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(resources.getDrawable(R.drawable.sandwich))
    }
}
