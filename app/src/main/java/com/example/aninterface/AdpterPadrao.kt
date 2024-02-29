package com.example.aninterface

class TomadaAntiga(val conector: Conector){
    fun passarEnergia(){
        val qtdPinos = conector.quantidadePinos()
        if (qtdPinos == 2){
            conector.ligarAparelho()
            println("passando energia")
        }else{
            println("Esse tomada só funciona com 2 pinos")
        }
        }

}
 class ConectorAdptador(val conetorNovoPadrao: ConetorNovoPadrao) : Conector{
     override fun quantidadePinos(): Int {
        return 2
     }

     override fun ligarAparelho() {
            conetorNovoPadrao.ligarAparelho()
     }

 }

interface Conector{
    fun quantidadePinos() : Int
    fun ligarAparelho()
}

class ConetorNovoPadrao : Conector {
  override fun quantidadePinos() : Int{
        return 3
    }

    override fun ligarAparelho(){
       println("Aparelho está ligado")
    }

}

fun main(){

    val conetorNovoPadrao = ConetorNovoPadrao()

    val conectorAdptador = ConectorAdptador(conetorNovoPadrao)

    val tomadaAntiga = TomadaAntiga(conetorNovoPadrao)
    tomadaAntiga.passarEnergia()


}