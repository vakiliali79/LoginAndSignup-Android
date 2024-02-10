package com.alivakili.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val loginBtn = findViewById(R.id.login_button) as Button
        // set on-click listener
        loginBtn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            // start your next activity
            startActivity(intent)        }

        val createAccountBtn=findViewById<Button>(R.id.create_account_button)
        createAccountBtn.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            // start your next activity
            startActivity(intent)        }
    }
}