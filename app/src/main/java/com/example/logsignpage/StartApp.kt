package com.example.logsignpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
=======
import android.widget.TextView
>>>>>>> 8d822b734d9e1d24c142d36bacc25eb1888d8e4f
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StartApp : AppCompatActivity() {

<<<<<<< HEAD
    lateinit var button: FloatingActionButton
=======
    lateinit var txtdetails:TextView
    lateinit var click:FloatingActionButton
>>>>>>> 8d822b734d9e1d24c142d36bacc25eb1888d8e4f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_app)

<<<<<<< HEAD
        button=findViewById(R.id.button)


        button.setOnClickListener {

            intent=Intent(this,contact::class.java)

            startActivity(intent)

        }
=======
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

>>>>>>> 8d822b734d9e1d24c142d36bacc25eb1888d8e4f
    }
}