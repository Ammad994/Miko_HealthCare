package com.medicine.mico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sign_in_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        val login_btn1 = findViewById<Button>(R.id.loginbtn1)
        login_btn1.setOnClickListener {
            var intent = Intent(this@Sign_in_Activity, Home_Activity::class.java)
            startActivity(intent)
        }

        val signup_btn2 = findViewById<Button>(R.id.login_btn2)
        signup_btn2.setOnClickListener {
            var intent = Intent(this@Sign_in_Activity, Sign_up_Activity::class.java)
            startActivity(intent)
        }
    }
}