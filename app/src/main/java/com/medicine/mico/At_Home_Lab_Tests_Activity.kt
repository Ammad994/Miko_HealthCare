package com.medicine.mico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class At_Home_Lab_Tests_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at_home_lab_tests)

        val home_activity=findViewById<Button>(R.id.account_btn)
        home_activity.setOnClickListener {
            var intent= Intent(this@At_Home_Lab_Tests_Activity,Home_Activity::class.java)
            startActivity(intent)
        }

        val meds_activity=findViewById<Button>(R.id.meds_btn)
        meds_activity.setOnClickListener {
            var intent= Intent(this@At_Home_Lab_Tests_Activity,Meds_Activity::class.java)
            startActivity(intent)
        }

        val beauty_activity=findViewById<Button>(R.id.button3)
        beauty_activity.setOnClickListener {
            var intent= Intent(this@At_Home_Lab_Tests_Activity,Beauty_Activity::class.java)
            startActivity(intent)
        }

        val test_activity=findViewById<Button>(R.id.button2)
        test_activity.setOnClickListener {
            var intent= Intent(this@At_Home_Lab_Tests_Activity,Tests::class.java)
            startActivity(intent)
        }

        val personal_btn=findViewById<Button>(R.id.button16)
        personal_btn.setOnClickListener {
            var intent= Intent(this@At_Home_Lab_Tests_Activity,Personal_btn_Activity::class.java)
            startActivity(intent)
        }
    }
}