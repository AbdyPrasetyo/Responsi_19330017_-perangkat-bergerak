package com.example.nohilang

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class KelProduk : AppCompatActivity() {
    private lateinit var btnk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelproduk)

        btnk = findViewById(R.id.btnkem)
        btnk.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}