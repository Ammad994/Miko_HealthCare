package com.medicine.mico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests)

        val home_activity=findViewById<Button>(R.id.account_btn)
        home_activity.setOnClickListener {
            var intent= Intent(this@Tests,Home_Activity::class.java)
            startActivity(intent)
        }

        val meds_activity=findViewById<Button>(R.id.meds_btn)
        meds_activity.setOnClickListener {
            var intent= Intent(this@Tests,Meds_Activity::class.java)
            startActivity(intent)
        }

        val beauty_activity=findViewById<Button>(R.id.button3)
        beauty_activity.setOnClickListener {
            var intent= Intent(this@Tests,Beauty_Activity::class.java)
            startActivity(intent)
        }

        val covid_19_btn=findViewById<Button>(R.id.button22)
        covid_19_btn.setOnClickListener {
            var intent= Intent(this@Tests,At_Home_Lab_Tests_Activity::class.java)
            startActivity(intent)
        }

        val sexual_health_btn=findViewById<Button>(R.id.button21)
        sexual_health_btn.setOnClickListener {
            var intent= Intent(this@Tests,Sexual_health_Activity::class.java)
            startActivity(intent)
        }

        val wellness_btn=findViewById<Button>(R.id.button18)
        wellness_btn.setOnClickListener {
            var intent= Intent(this@Tests,Wellness_btn_Activity::class.java)
            startActivity(intent)
        }

        val women_health_btn=findViewById<Button>(R.id.button17)
        women_health_btn.setOnClickListener {
            var intent= Intent(this@Tests,Womens_health_btn_Activity::class.java)
            startActivity(intent)
        }

        val mens_health_btn=findViewById<Button>(R.id.button16)
        mens_health_btn.setOnClickListener {
            var intent= Intent(this@Tests,Mens_Health_btn_Activity::class.java)
            startActivity(intent)
        }

    }
}