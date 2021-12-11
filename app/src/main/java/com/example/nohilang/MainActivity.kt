package com.example.nohilang

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    private lateinit var btnj: Button
    private lateinit var btn1: ImageView
    private lateinit var  btnts: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnj = findViewById(R.id.btn_j)
        btnj.setOnClickListener {
                startActivity(Intent(this, Haljual::class.java))
        }
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            startActivity(Intent(this, KelProduk::class.java))
        }

        btnts = findViewById(R.id.btntran)
        btnts.setOnClickListener {
            startActivity(Intent(this, Transaksi::class.java))
        }
    }
}
