package com.example.recipeapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fishandchip.*

class fishandchip : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fishandchip)

        httpLinkFishandChip.setOnClickListener()
        {
            ViewVideo()
        }

    }

    fun ViewVideo()
    {
        val url = "https://www.allrecipes.com/recipe/16580/classic-fish-and-chips/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
}