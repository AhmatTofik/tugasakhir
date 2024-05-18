package com.example.tugasakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class card_adapter (
    val listNama : List<String>,
    val listFoto: List<Int>
) : RecyclerView.Adapter<card_adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): card_adapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter,parent,false)

        )
    }

    override fun onBindViewHolder(holder: card_adapter.ViewHolder, position: Int) {
        holder.Text1.text = listNama[position]
        holder.Foto1.setImageResource(listFoto[position])
    }

    override fun getItemCount(): Int {
        return listNama.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder (view){
        val Text1 = view.findViewById<TextView>(R.id.text1)
        val  Foto1=view.findViewById<ImageView>(R.id.image1)
    }

}