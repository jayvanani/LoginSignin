package com.example.logsignpage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class contact : AppCompatActivity() {

    lateinit var submit:MaterialButton
    lateinit var fullname: TextInputEditText
    lateinit var mobile:TextInputEditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        submit=findViewById(R.id.submit)
        fullname=findViewById(R.id.fullname)
        mobile=findViewById(R.id.mobile)


        submit.setOnClickListener {

            var data=MyDatabase(this)

            data.insert(fullname.text.toString(),mobile.text.toString())


            var intent=Intent


        }
    }
}