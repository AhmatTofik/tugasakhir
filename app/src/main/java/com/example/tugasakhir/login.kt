package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button =  findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
        val  button1 =findViewById<TextView>(R.id.textView7)
        val intent = Intent(this    , daftar::class.java)
        button1.setOnClickListener() {
            startActivity(intent)
        }
    }
}