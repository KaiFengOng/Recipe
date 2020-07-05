package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pizza_menu.*

class pizzaMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_menu)

        btnCastIronPizza.setOnClickListener()
        {
            Go2castironpizza()
        }
    }

    fun Go2castironpizza()
    {
        var intent = Intent(this, castironpizza::class.java)
        startActivity(intent)
    }
}