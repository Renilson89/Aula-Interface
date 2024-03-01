package com.example.aninterface

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<String>)
    : Adapter<MensagemAdapter.MensagemViewHolder>()
{
      inner class MensagemViewHolder(
          val itemView: View
      ) : ViewHolder(itemView) {

      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        val itemView = layoutInflater.inflate(
            R.layout.item_lista,parent,false
        )
        return MensagemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
       val nome = lista[position]

    }

    override fun getItemCount(): Int {
        return lista.size
    }

}