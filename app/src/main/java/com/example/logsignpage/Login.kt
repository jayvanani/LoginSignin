package com.example.logsignpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


// SQLite
// local

class Login : AppCompatActivity() {

    lateinit var signup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        signup=findViewById(R.id.signup)

        signup.setOnClickListener {

            intent=Intent(this@Login,SignUp::class.java)

            startActivity(intent)
            finish()


        }

    }
}