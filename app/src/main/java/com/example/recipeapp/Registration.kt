package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnReturn.setOnClickListener()
        {
            Go2MainActivity()
        }

        btnRegister.setOnClickListener()
        {
            if(txtRegEmail.text.isEmpty() && txtRegPassword.text.isEmpty())
            {
                Toast.makeText(applicationContext, "Please Fill All Details", Toast.LENGTH_LONG).show()
            }

            else
            {
                Toast.makeText(applicationContext, "Your Registration Is Successful", Toast.LENGTH_LONG).show()
                txtRegEmail.isEnabled = false
                txtRegPassword.isEnabled = false
            }

        }

        txtRegPassword
        txtRegEmail
    }

    fun Go2MainActivity()
    {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}