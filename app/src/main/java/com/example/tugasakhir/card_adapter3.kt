package com.example.tugasakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class card_adapter3(
    val listDescription3:List<String>,
    val listFoto3: List<Int>,
    val listHstg3:List<String>,
    val listHstg4:List<String>
) : RecyclerView.Adapter<card_adapter3.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): card_adapter3.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter3,parent,false)

        )
    }

    override fun onBindViewHolder(holder: card_adapter3.ViewHolder, position: Int) {
        holder.Text1.text = listDescription3[position]
        holder.Text2.text=listHstg3[position]
        holder.Text3.text=listHstg4[position]
        holder.Foto1.setImageResource(listFoto3[position])
    }

    override fun getItemCount(): Int {
        return listDescription3.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder (view){
        val Text1 = view.findViewById<TextView>(R.id.textView19)
        val  Foto1=view.findViewById<ImageView>(R.id.imageView)
        val Text2=view.findViewById<TextView>(R.id.editText4)
        val  Text3=view.findViewById<TextView>(R.id.editText5)
    }

}