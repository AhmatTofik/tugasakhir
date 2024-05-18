package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val  buttonforum  = findViewById<ImageView>(R.id.imageView6)
        buttonforum.setOnClickListener{
            val intent =  Intent(this,forum::class.java)
            startActivity(intent)
        }

        val buttonartikel = findViewById<ImageView>(R.id.imageView5)
        buttonartikel.setOnClickListener{
            val intent = Intent(this,artikel::class.java)
            startActivity(intent)
        }

        val listNama = listOf<String>(
            "Topek",
            "Haikal",
            "Ibni",
            "Nabil"
        )
        val listFoto = listOf<Int>(
            R.drawable.ft1,
            R.drawable.ft2,
            R.drawable.ft1,
            R.drawable.ft1
        )

        val  listNama1= listOf<String>(
            "Supaat Okee",
             "Wahyuu okee",
            "lilah okee"
        )

        val  listFoto1= listOf<Int>(
            R.drawable.ft3,
            R.drawable.ft4,
            R.drawable.ft3
        )
        val listDescription1= listOf<String>(
            "Hi! mnurut kalian gimana sih cara kalian untuk mengimbangi waktu belajar dan santai",
            "Hi! mnurut kalian gimana sih cara kalian untuk mengimbangi waktu belajar dan santai",
            "Hi! mnurut kalian gimana sih cara kalian untuk mengimbangi waktu belajar dan santai"
        )
        val listHstg1= listOf<String>(
            "Belajar",
            "Belajar",
            "Belajar"
        )
        val  listHstg2= listOf<String>(
            "Workbalance",
            "Workbalance",
            "Workbalance"
        )

        val listDescription3= listOf<String>(
            "Ternyata hobi itu bisa  jadi pengaruh life balance loh",
            "Tau gak sih kalo obat ini bisa bantu dalam kefokusan"
        )

        val listFoto3= listOf<Int>(
            R.drawable.ft5,
            R.drawable.ft6
        )

        val listHstg3= listOf<String>(
            "#hobby",
            "#focus"
        )

        val listHstg4= listOf<String>(
            "#balance",
            "#grow"
        )

        val recyclerView : RecyclerView = findViewById(R.id.horizontal)
        val recyclerView1 : RecyclerView=findViewById(R.id.horizontal1)
        val recyclerView2:RecyclerView=findViewById(R.id.horizontal2)

        recyclerView.adapter = card_adapter(listNama,listFoto)
        recyclerView1.adapter=card_adapter2(listNama1, listDescription1 ,listFoto1, listHstg1, listHstg2 )
        recyclerView2.adapter=card_adapter3(listDescription3,listFoto3 , listHstg3,listHstg4 )

    }
}