package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class forum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum)

        val buttonkembali1 = findViewById<ImageView>(R.id.imageView10)
        buttonkembali1.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)

        val scheduleTextView = findViewById<TextView>(R.id.textView29)
        val schedule = "1. Buat jadwal yang teratur :\n" +
                "Tetapkan jadwal yang jelas untuk belajar dan waktu santai . Pastikan untuk membagi waktu secara adil antara keduanya .\n\n" +
                "2. Tetapkan prioritas :\n" +
                "Tentukan mata pelajaran atau tugas yang perlu diprioritaskan untuk belajar , namun jangan lupakan pentingnya waktu santai untuk mengistirahatkan pikiran .\n" +
                "Semoga membantuuu"
        scheduleTextView.text = schedule
    }
}}