package com.example.tugasakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class card_adapter2(
    val listNama1 : List<String>,
    val listDescription1 : List<String>,
    val listFoto1: List<Int>,
    val listHstg1:List<String>,
    val listHstg2:List<String>
) : RecyclerView.Adapter<card_adapter2.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): card_adapter2.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter2,parent,false)

        )
    }

    override fun onBindViewHolder(holder: card_adapter2.ViewHolder, position: Int) {
            holder.Text1.text = listNama1[position]
            holder.Text2.text = listDescription1[position]
            holder.Text3.text = listHstg1[position]
            holder.Text4.text = listHstg2[position]
            holder.Foto1.setImageResource(listFoto1[position])
        }
    
    override fun getItemCount(): Int {
        return listNama1.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder (view){
        val Text1 = view.findViewById<TextView>(R.id.textView1)
        val Text2 = view.findViewById<TextView>(R.id.textView13)
        val  Foto1=view.findViewById<ImageView>(R.id.imageView8)
        val  Text3=view.findViewById<TextView>(R.id.editText3)
        val Text4=view.findViewById<TextView>(R.id.textView4)
    }

}