package com.medicine.mico

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Home_Activity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val home_activity=findViewById<Button>(R.id.account_btn)
        home_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Home_Activity::class.java)
            startActivity(intent)
        }

        val meds_activity=findViewById<Button>(R.id.meds_btn)
        meds_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Meds_Activity::class.java)
            startActivity(intent)
        }

        val beauty_activity=findViewById<Button>(R.id.button3)
        beauty_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Beauty_Activity::class.java)
            startActivity(intent)
        }

        val test_activity=findViewById<Button>(R.id.button2)
        test_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Tests::class.java)
            startActivity(intent)
        }

        val evt_activity=findViewById<Button>(R.id.evt_btn)
        evt_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Essential_Test_Activity::class.java)
            startActivity(intent)
        }

        val covid_activity=findViewById<Button>(R.id.button9)
        covid_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Covid_Test_Activity::class.java)
            startActivity(intent)
        }

        val dermatology_activity=findViewById<Button>(R.id.button10)
        dermatology_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,AI_Dermatology_Activity::class.java)
            startActivity(intent)
        }

        val info_activity=findViewById<Button>(R.id.button35)
        info_activity.setOnClickListener {
            var intent= Intent(this@Home_Activity,Infoicon_Activity::class.java)
            startActivity(intent)
        }

        }

    fun Tapon(view: View) {
        val text_change=findViewById<TextView>(R.id.ticktext_change)
        text_change.text="You've taken all of your Atorvastatin today. Your next dose is tomorrow at 10:00."
    }

    fun Tapon_cross(view: View) {
        val text_change=findViewById<TextView>(R.id.ticktext_change)
        text_change.text="If you are, take your next dose at the usual time. Never take 2 doses at the same time. Never take extra doses."
    }

}
