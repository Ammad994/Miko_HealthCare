package com.medicine.mico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sign_up_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val login_btn2 = findViewById<Button>(R.id.login_btn2)
        login_btn2.setOnClickListener {
            var intent = Intent(this@Sign_up_Activity, Sign_in_Activity::class.java)
            startActivity(intent)
        }

        val get_started = findViewById<Button>(R.id.getstarted)
        get_started.setOnClickListener {
            var intent = Intent(this@Sign_up_Activity, Sign_up_Activity::class.java)
            startActivity(intent)
        }
    }
}