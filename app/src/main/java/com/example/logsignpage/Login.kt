package com.example.logsignpage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

// SQLite
// local

class Login : AppCompatActivity() {

    lateinit var login: MaterialButton
    lateinit var username: TextInputEditText
    lateinit var pass: TextInputEditText
    lateinit var signup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_log_in)
        signup = findViewById(R.id.signup)
        login = findViewById(R.id.login)
        username = findViewById(R.id.username)
        pass = findViewById(R.id.pass)


        login.setOnClickListener {
            var data = MyDatabase(this)
            var cursor = data.selectuser(username.text.toString(), pass.text.toString())
            var fullname = ""
            var email = ""
            var username = ""
            var pasword = ""
            while (cursor.moveToNext()) {
                fullname = cursor.getString(0)
                email = cursor.getString(1)
                username = cursor.getString(2)
                pasword = cursor.getString(3)
                var intent = Intent(this, StartApp::class.java)
                startActivity(intent)
            }
            Log.d("====", "onCreate: $fullname+$email+$username+$pasword")
        }
        signup.setOnClickListener {

            intent = Intent(this@Login, SignUp::class.java)

            startActivity(intent)
            finish()


        }

    }
}