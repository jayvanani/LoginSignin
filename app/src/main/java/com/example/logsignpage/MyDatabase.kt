package com.example.logsignpage

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class MyDatabase(var context: Context) : SQLiteOpenHelper(context,"mydata.db",null,1) {
    override fun onCreate(db: SQLiteDatabase) {

        var table = "CREATE TABLE user (fullname text ,email text,username text,password text,repeatpassword text)"
        db.execSQL(table)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    fun insertdata(
        fullname: String,
        email: String,
        username: String,
        password: String,
        repeatpassword: String
    )
    {

        var insert = "INSERT INTO user VALUES ('$fullname','$email','$username','$password','$repeatpassword')"

        try {
            writableDatabase.execSQL(insert)

        }catch (e : Exception)
        {
            Log.e("-=--====", "insertdata: $e")
        }

    }



}