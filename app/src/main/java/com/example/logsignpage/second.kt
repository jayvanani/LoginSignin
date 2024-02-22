package com.example.logsignpage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class second : AppCompatActivity() {


    lateinit var name: TextInputEditText
    lateinit var number:TextInputEditText
    lateinit var submit:MaterialButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        name=findViewById(R.id.name)
        number=findViewById(R.id.number)
        submit=findViewById(R.id.submit)


        submit.setOnClickListener {

            var data=MyDatabase(this)
            data.insert(name.text.toString(),number.text.toString())

        }



    }
}