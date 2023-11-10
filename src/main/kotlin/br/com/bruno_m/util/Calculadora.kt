package br.com.bruno_m.aula.kotlin

class Calculadora {
    // Método para somar dois inteiros
    fun soma(v1: Int, v2: Int) = v1 + v2

    // Método para subtrair dois inteiros
    fun sub(v1: Int, v2: Int) = v1 - v2

    // Método para multiplicar dois inteiros
    fun mult(v1: Int, v2: Int) = v1 * v2

    // Método para dividir dois inteiros, convertendo o resultado para Float para obter divisão fracionária
    fun div(v1: Int, v2: Int) = v1 / v2.toFloat()

    // Sobrecarga do método divisao para aceitar e retornar Float
    fun divisao(v1: Float, v2: Float) = v1 / v2
}