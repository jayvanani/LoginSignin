package com.example.logsignpage

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class SignUp : AppCompatActivity() {

    lateinit var login: TextView
    lateinit var fullname: TextInputEditText
    lateinit var email: TextInputEditText
    lateinit var username: TextInputEditText
    lateinit var password: TextInputEditText
    lateinit var repeatpassword: TextInputEditText


    lateinit var signup: MaterialButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        login = findViewById(R.id.login)
        fullname = findViewById(R.id.fullname)
        email = findViewById(R.id.email)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        repeatpassword = findViewById(R.id.repeatpassword)

        signup = findViewById(R.id.signup)

        login.setOnClickListener {

            var intent = Intent(this@SignUp, Login::class.java)

            startActivity(intent)
            finish()

        }

        signup.setOnClickListener {

            var data = MyDatabase(this)
            data.insertdata(
                fullname.text.toString(),
                email.text.toString(),
                username.text.toString(),
                password.text.toString(),
                repeatpassword.text.toString()
            )

            var intent = Intent(this, Login::class.java)
            startActivity(intent)


        }

    }
}