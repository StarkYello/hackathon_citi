package com.intern.xing.hackathon_citi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_budget.*

class ConciergeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concierge)
        bottom_navigation.setSelectedItemId(R.id.conciergeScreen)
        supportActionBar!!.title = "Concierge Screen"


        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeScreen -> {
                    startActivity(Intent(this, BudgetActivity::class.java))
                }
                R.id.experienceScreen -> {
                    startActivity(Intent(this, ExperienceActivity::class.java))
                }
                R.id.conciergeScreen ->{
                    startActivity(Intent(this, ConciergeActivity::class.java))
                }
                R.id.miscScreen ->{
                    startActivity(Intent(this, MytripActivity::class.java))
                }

            }
            false
        }
    }
}
