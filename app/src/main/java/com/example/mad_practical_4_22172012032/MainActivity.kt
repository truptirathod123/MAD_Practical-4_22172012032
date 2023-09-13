package com.example.mad_practical_4_22172012003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button =findViewById<View>(R.id.button3)
        var button2 =findViewById<View>(R.id.button4)
        button.setOnClickListener {
            intent = Intent(this, Login_Activity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            intent = Intent(this, Registration_Activity::class.java)
            startActivity(intent)
        }
    }
}