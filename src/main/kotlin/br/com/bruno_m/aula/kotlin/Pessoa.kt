package br.com.bruno_m.aula.kotlin

open class Pessoa(val nome: String, val peso: Float, val altura: Float) {
    val imc get() = peso / (altura * altura)
}