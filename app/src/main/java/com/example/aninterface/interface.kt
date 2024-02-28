package com.example.aninterface

/*
* DRY -> Dont Repeat Yourself(Não repita Código)
* Divisão de responsabilidades
* Classes devem UTILIZAR outras classes
* Alto Acoplamento e Baixo Acoplamento
* */

class musico(val instrumento: Instrumento){
    fun tocar(){
        println("Musico Tocando")
        instrumento.sendoTocado()

    }
}

class Bateira : Instrumento{
   override fun sendoTocado(){
        println("tocando bateria")
    }
    fun ajutarBaquetas(){}
}
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////   HERANÇA e INTERFACE   //////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

interface Instrumento{
       fun sendoTocado()
}
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////


class Violao : Instrumento{
    override fun sendoTocado(){
        println("Utilizar cordas")
        println("para tocar o violão")
    }
    fun ajustarCordas(){

        println("tocando Guitarra")
        println("Afinando Guitarra")
    }
}

class guitarra : Instrumento{
     override fun sendoTocado(){}
}

fun main(){
   // val violao: Instrumento = Violao()
   // val bateira: Instrumento = Bateira()

    val violao1 = Violao()
    val musico1 = musico(violao1)
    musico1.tocar()


    val bateria1 = Bateira()
    val musico2 = musico(bateria1)
    musico2.tocar()

    val guitarra = guitarra()
    val musico3 = musico(guitarra)
    musico3.tocar()
}
