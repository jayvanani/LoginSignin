package com.example.logsignpage

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class MyDatabase(var context: Context) : SQLiteOpenHelper(context, "mydata.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {

        var table =
            "CREATE TABLE user (fullname text ,email text,username text,password text,repeatpassword text)"
        db.execSQL(table)

        var tbl2="create table tbl2 (fullname text,mobile text)"
        db.execSQL(tbl2)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    fun insertdata(
        fullname: String,
        email: String,
        username: String,
        password: String,
        repeatpassword: String
    ) {

        var insert =
            "INSERT INTO user VALUES ('$fullname','$email','$username','$password','$repeatpassword')"

        try {
            writableDatabase.execSQL(insert)

        } catch (e: Exception) {
            Log.e("-=--====", "insertdata: $e")
        }

    }

    fun selectuser(username: String, pass: String): Cursor {

        var select = "SELECT * FROM user WHERE username = '$username' AND password = '$pass'"

        var cursor = readableDatabase.rawQuery(select, null)


        return cursor
    }

    fun insert(fullname: String, mobile: String) {

        var insert="INSERT INTO tbl2 values ('$fullname','$mobile') "
        try{
            writableDatabase.execSQL(insert)
        }catch (e:Exception)
        {
            Log.e("--","$e")
        }

    }


}