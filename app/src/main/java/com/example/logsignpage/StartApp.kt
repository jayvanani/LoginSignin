package com.example.logsignpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StartApp : AppCompatActivity() {

    lateinit var button: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_app)

        button=findViewById(R.id.button)


        button.setOnClickListener {

            intent=Intent(this,contact::class.java)

            startActivity(intent)

        }
    }
}