package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val button =  findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
        val button1 =  findViewById<TextView>(R.id.textView6)
        button1.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}