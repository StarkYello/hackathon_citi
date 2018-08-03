package com.intern.xing.hackathon_citi

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_budget.*

class BudgetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.gold)))
        supportActionBar!!.title = "Budget Screen"
        arrowButton.setOnClickListener {
            startActivity(Intent(this,SpendingActivity::class.java))
        }
        bottom_navigation.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.homeScreen -> {
                    startActivity(Intent(this, BudgetActivity::class.java))
                }
                R.id.experienceScreen -> {
                    startActivity(Intent(this, ExperienceActivity::class.java))
                }
            }
            false
        }
    }
}
