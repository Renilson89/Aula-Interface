package com.example.aninterface

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>)
    : Adapter<MensagemAdapter.MensagemViewHolder>()
{
      inner class MensagemViewHolder(
          val itemView: View
      ) : ViewHolder(itemView) {
             val txtNome: TextView = itemView.findViewById(R.id.text_car_titulo)
             val txtMsg: TextView = itemView.findViewById(R.id.text_aplicacao)
             //val txtHora: TextView = itemView.findViewById(R.id.txt_hora)

      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        /*val itemView = layoutInflater.inflate(
            R.layout.item_lista,parent,false
        )*/
        val itemView = layoutInflater.inflate(
            R.layout.cardview,parent,false
        )
        return MensagemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
       val mensagem= lista[position]
        holder.txtNome.text = mensagem.nome
        holder.txtMsg.text = mensagem.ultima
       // holder.txtHora.text = mensagem.horario

        
    }

    override fun getItemCount(): Int {
        return lista.size
    }

}