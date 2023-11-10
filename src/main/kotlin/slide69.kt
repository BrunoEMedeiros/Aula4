

fun main() {
    val numeros = lerNumeros()
    calcularEExibirResultados(numeros)
}

fun lerNumeros(): List<Double> {
    var entrada: String
    val numeros = mutableListOf<Double>()

    do {
        //lendo numero do console do usuario
        print("Digite um número ou 'fim' para terminar: ")
        entrada = readLine() ?: ""

        //saindo do loop usando a palavra "fim"
        if (entrada.toLowerCase() == "fim") {
            break
        }

        try {
            numeros.add(entrada.toDouble())
        } catch (e: NumberFormatException) {
            println("Entrada inválida, por favor digite um número ou 'fim'.")
        }
    } while (entrada.toLowerCase() != "fim")

    return numeros
}

fun calcularEExibirResultados(numeros: List<Double>) {
    if (numeros.isNotEmpty()) {
        val soma = numeros.sum()
        val media = soma / numeros.size

        println("Você digitou ${numeros.size} números.")
        println("A soma é $soma e a média é $media.")
    } else {
        println("Nenhum número foi digitado.")
    }
}

