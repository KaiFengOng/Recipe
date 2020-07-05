package com.example.recipeapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_castironpizza.*

class castironpizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_castironpizza)

        httpLinkcastironpizza.setOnClickListener()
        {
            ViewVideo()
        }
    }

    fun ViewVideo()
    {
        val url = "https://www.tasteofhome.com/recipes/cast-iron-pizza-pie/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
}