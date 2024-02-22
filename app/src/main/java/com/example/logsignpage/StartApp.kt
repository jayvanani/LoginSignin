package com.example.logsignpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StartApp : AppCompatActivity() {

    lateinit var txtdetails:TextView
    lateinit var click:FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_app)

        txtdetails=findViewById(R.id.txtdetails)
        click=findViewById(R.id.click)

        var fullname=intent.getStringExtra("fullname")
        var email=intent.getStringExtra("email")
        var username=intent.getStringExtra("username")

        txtdetails.setText(fullname+"\n"+email+"\n"+username)



        click.setOnClickListener {

            var intent=Intent(this,second::class.java)
            startActivity(intent)

        }

    }
}