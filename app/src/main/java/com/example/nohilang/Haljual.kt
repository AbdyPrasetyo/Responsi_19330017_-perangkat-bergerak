package com.example.nohilang

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Haljual  : AppCompatActivity() {
    private lateinit var btnbk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.haljual)

        btnbk = findViewById(R.id.btnb)
        btnbk.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}