package com.intern.xing.hackathon_citi

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BudgetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.gold)))
        supportActionBar!!.title = "Budget Screen"
    }
}
