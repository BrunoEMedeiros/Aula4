

fun main() {
    // Declara variavel iniciando em 0
    var i = 0

    // Executa um loop enquanto 'j' for menor que 10.
    while (i < 10) {
        // Incrementa 'j' em 1 a cada iteração do loop.
        i++

        // Verifica se 'j' é igual a 4.
        if (i == 4)
        // Se 'j' for igual a 4, ignora as instruções restantes no loop e continua na próxima iteração.
            continue

        // Printa o valor atual de 'j' seguido de uma vírgula.
        // Esta linha não será executada quando 'j' for 4 devido ao 'continue'.
        print("$i, ")
    } }