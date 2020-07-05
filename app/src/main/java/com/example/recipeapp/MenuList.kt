package com.example.recipeapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_list.*

class MenuList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)

        btnfishandchipmenu.setOnClickListener()
        {
            Go2FishandChipMenu()
        }

        btncakemenu.setOnClickListener()
        {
            Go2CakeMenu()
        }

        btnspaghettimenu.setOnClickListener()
        {
            Go2SpaghettiMenu()
        }

        btnpizzamenu.setOnClickListener()
        {
            Go2PizzaMenu()
        }

        btncakemenu.setOnClickListener()
        {
            Go2CakeMenu()
        }

        btnfishandchipmenu.setOnClickListener()
        {
            Go2FishandChipMenu()
        }

        httpviewcookies.setOnClickListener()
        {
            ViewCookies()
        }
        httpviewcandy.setOnClickListener()
        {
            ViewCandy()
        }

        httpviewpopcorn.setOnClickListener()
        {
            ViewPopCorn()
        }

        btnviewcompanydetails.setOnClickListener()
        {
            ViewComapnyDetails()
        }


    }

    fun Go2FishandChipMenu()
    {
        var intent = Intent(this, fishandchipmenu::class.java)
        startActivity(intent)
    }

    fun Go2CakeMenu()
    {
        var intent = Intent(this , cakeMenu::class.java)
        startActivity(intent)
    }

    fun Go2SpaghettiMenu()
    {
        var intent =Intent(this, spaghettiMenu::class.java)
        startActivity(intent)
    }

    fun Go2PizzaMenu()
    {
        var intent = Intent(this, pizzaMenu::class.java)
        startActivity(intent)
    }


    fun ViewCookies()
    {
        val url = "https://www.allrecipes.com/recipes/362/desserts/cookies/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun ViewCandy()
    {
        val url = "https://www.allrecipes.com/recipes/372/desserts/candy/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun ViewPopCorn()
    {
        val url = "https://www.allrecipes.com/recipes/16051/appetizers-and-snacks/snacks/popcorn/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun ViewComapnyDetails()
    {
        val url = "https://www.fourtitude.asia/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
}