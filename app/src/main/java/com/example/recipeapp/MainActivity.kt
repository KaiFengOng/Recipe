package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGuest.setOnClickListener()
        {

        }

        btnRegister.setOnClickListener()
        {
            Go2Registration()
        }

        btnLogin.setOnClickListener()
        {
            Go2MenuList()
        }
    }

    fun Go2MenuList()
    {
        var intent = Intent(this, MenuList::class.java)
        startActivity(intent)
    }

    fun Go2Registration()
    {
        var intent = Intent(this, Registration::class.java)
        startActivity(intent)
    }
}