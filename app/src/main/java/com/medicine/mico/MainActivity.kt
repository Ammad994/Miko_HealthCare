package com.medicine.mico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signin_btn1=findViewById<Button>(R.id.signinbtn1)
        signin_btn1.setOnClickListener {
            var intent=Intent(this@MainActivity,Sign_in_Activity::class.java)
            startActivity(intent)
        }

        val signup_btn0=findViewById<Button>(R.id.signupbtn0)
        signup_btn0.setOnClickListener {
            var intent =Intent(this@MainActivity,Sign_up_Activity::class.java)
            startActivity(intent)
        }
    }
}