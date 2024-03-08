package com.example.aninterface

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(

    private val clique:()->Unit
) : Adapter<MensagemAdapter.MensagemViewHolder>()
{
    private val listaMensagem = mutableListOf<Mensagem >()

    fun atualizarListadeDados( lista: List<Mensagem>){
        listaMensagem.addAll(lista)
    }

      inner class MensagemViewHolder(
          val itemView: View
      ) : ViewHolder(itemView) {
             val txtNome: TextView = itemView.findViewById(R.id.text_car_titulo)
             val txtMsg: TextView = itemView.findViewById(R.id.text_aplicacao)
             val button: Button = itemView.findViewById(R.id.btn1)
             //val txtHora: TextView = itemView.findViewById(R.id.txt_hora)
                fun bind(mensagem: Mensagem){
                 txtNome.text = mensagem.nome
                 txtMsg.text = mensagem.ultima
                }
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
       val mensagem= listaMensagem[position]
        holder.bind(mensagem)


       // holder.txtHora.text = mensagem.horario

        //Aplica Evento de Click///////
        /*val context = holder.button.context
        holder.button.setOnClickListener{
            Toast.makeText(context, "IDARON", Toast.LENGTH_SHORT).show()
        }*/
        
        
    }

    override fun getItemCount(): Int {
        return listaMensagem.size
    }

}