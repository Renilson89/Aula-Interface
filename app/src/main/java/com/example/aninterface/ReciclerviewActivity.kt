package com.example.aninterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReciclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciclerview)

        val lista = listOf(
            Mensagem("Renilson Marques", "Negativo", "11:50"),
            Mensagem("Pinheiro", "asdf", "11:50"),
            Mensagem("asdf", "asdf", "11:50"),
            Mensagem("Cuevo", "Nasdf","15:55"),
            Mensagem("asdfasdfasdf", "no", "5:50"),
        )

        rvLista = findViewById(R.id.rv_lista)

        
        rvLista.adapter = MensagemAdapter{
            startActivity(
                Intent(this,ListViewActivity::class.java)
            )
        }
        rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false)

        //DIVISOR COM RECICLEVIEW
        rvLista.addItemDecoration(
            DividerItemDecoration(this, RecyclerView.VERTICAL)
        )
    }
}