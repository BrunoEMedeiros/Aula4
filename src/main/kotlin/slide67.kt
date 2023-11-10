
fun main() {
    val numero = "2" // Declara uma string com o valor "2".

    println(numero + 2) // Concatena a string "2" com o número 2, resultando em "22".

    println(numero.toInt() + 2) // Converte a string "2" para um inteiro e adiciona 2, resultando em 4.

    println(numero.toFloat() + 2) // Converte a string "2" para um float e adiciona 2, resultando em 4.0.

    println((numero.toDouble() + 2).toString()) // Converte a string "2" para um double, adiciona 2 e converte para string, resultando em "4.0".

    println((numero.toDouble() + 2).toString() + 2) // Converte "2" para double, adiciona 2, converte para string e concatena com "2", resultando em "4.02".
}