package com.medicine.mico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meds_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meds)

        val home_activity=findViewById<Button>(R.id.account_btn)
        home_activity.setOnClickListener {
            var intent= Intent(this@Meds_Activity,Home_Activity::class.java)
            startActivity(intent)
        }

        val beauty_activity=findViewById<Button>(R.id.button3)
        beauty_activity.setOnClickListener {
            var intent= Intent(this@Meds_Activity,Beauty_Activity::class.java)
            startActivity(intent)
        }

        val test_activity=findViewById<Button>(R.id.button2)
        test_activity.setOnClickListener {
            var intent= Intent(this@Meds_Activity,Tests::class.java)
            startActivity(intent)
        }
    }
}