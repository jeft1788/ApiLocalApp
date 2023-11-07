package com.example.apilocalapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnentrar = findViewById<Button>(R.id.btnEntrar)
        btnentrar.setOnClickListener {
            startActivity(Intent(applicationContext, PublicacionesActivity::class.java))
        }
    }
}