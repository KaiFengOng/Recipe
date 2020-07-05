package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_spaghetti_menu.*

class spaghettiMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu)

        btnspaghettimeatballs.setOnClickListener()
        {
            Go2spaghettimeatballs()
        }

        btnspaghettibolognese.setOnClickListener()
        {
            Go2spaghettibolognese()
        }
    }


    fun Go2spaghettimeatballs()
    {
        var intent = Intent(this, spaghettimeatballs::class.java)
        startActivity(intent)
    }

    fun Go2spaghettibolognese()
    {
        var intent = Intent(this, spaghettibolongnese::class.java)
        startActivity(intent)
    }
}