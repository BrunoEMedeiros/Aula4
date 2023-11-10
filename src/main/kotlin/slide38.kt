

fun main() {
    val salario = 500 // ou 4.toFloat()

    // Declara uma variável para armazenar o resultado da avaliação.
    var resultado = ""

    // Usa a estrutura `when` para avaliar a condicao financeira e armazena na variavcel `resultado`.
    resultado = when (salario) {
        // Se o salario estiver entre 600 e 1000, a variável resultado recebe o valor "Tá bem".
        in 600..1000 -> "Coach"

        // Se a nota estiver entre 400 e 600, a variável resultado recebe o valor "Maios ou menos".
        in 400..600 -> "Pessoa padrao"

        // Se a nota estiver entre 0 e 400, a variável resultado recebe o valor "Tá lascado".
        in 0..400 -> "Pessoa que compra o curso do coach"

        // Se a nota não estiver dentro de nenhum dos intervalos anteriores, a variável resultado recebe o valor "INVALIDA".
        else -> "INVALIDA"
    }
    // Printa o resultado.
    println(resultado)
}