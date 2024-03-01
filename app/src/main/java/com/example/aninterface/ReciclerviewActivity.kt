package com.example.aninterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ReciclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciclerview)

        rvLista = findViewById(R.id.rv_lista)
    }
}