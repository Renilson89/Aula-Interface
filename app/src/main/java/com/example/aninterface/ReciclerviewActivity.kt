package com.example.aninterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            Mensagem("Kele", "asdf", "11:50"),
            Mensagem("Magrela", "Nasdf","15:55"),
            Mensagem("Magrela2", "no", "5:50"),
        )

        rvLista = findViewById(R.id.rv_lista)
        rvLista.adapter = MensagemAdapter(lista)
        rvLista.layoutManager = LinearLayoutManager(this)
    }
}