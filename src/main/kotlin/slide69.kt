
//fun main() {
//    // Atribui a variavel de tipo any o valor 's'
//    var entrada: Any = "s"
//    // Inicializa uma variável para manter a soma dos números digitados.
//    var total = 0f
//
//    do {
//        // Solicita ao usuário que digite um número inteiro ou 's' para sair.
//        print("Digite um número inteiro ou 's' para sair: ")
//        try {
//            // Lê a entrada do usuário.
//            entrada = readLine()!!
//            // Verifica se a entrada é igual a 's'.
//            if (entrada == "s")
//                break // Sai do loop se o usuário digitar 's'.
//            // Soma o número inteiro convertido à variável total.
//            total += entrada.toInt()
//        } catch (e: NumberFormatException) {
//            // Captura erros de formatação de número e solicita nova entrada.
//            println("Número inválido, tente novamente!")
//        } catch (e: Exception) {
//            // Captura qualquer outra exceção não prevista.
//            println("!!!Houve uma exceção!!!")
//        } finally {
//            // Bloco finally que executa após cada tentativa, imprime o total parcial.
//            println("total parcial: $total")
//        }
//    } while (entrada != "s") // Continua o loop até que 's' seja digitado.
//}

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

