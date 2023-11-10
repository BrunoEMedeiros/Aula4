package br.com.bruno_m.aula.kotlin

open class Cliente(var renda: Float, nome: String, peso: Float, altura: Float){
    val aprovacao get() = renda > 1000 // Método para aprovação financeira.
}