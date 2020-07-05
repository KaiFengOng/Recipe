package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fishandchipmenu.*

class fishandchipmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fishandchipmenu)

        btnFishandChip.setOnClickListener()
        {
            Go2FishandChip()
        }
    }

    fun Go2FishandChip()
    {
        var intent = Intent(this, fishandchip::class.java)
        startActivity(intent)
    }
}