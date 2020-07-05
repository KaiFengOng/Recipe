package com.example.recipeapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_spaghettibolongnese.*

class spaghettibolongnese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghettibolongnese)

        httpLinkBolongnese.setOnClickListener()
        {
            ViewVideo()
        }
    }

    fun ViewVideo()
    {
        val url = "https://www.bbc.co.uk/food/recipes/easy_spaghetti_bolognese_93639"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)

    }


}