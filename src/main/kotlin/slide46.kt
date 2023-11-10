
fun main() {
    // Chama a função passando o parametro 2.
    semaforo(2)
    // Chama a função passando o parametro 3.
    semaforo(3)
    // Chama a função passando o parametro 2.
    semaforo(1)
}

fun semaforo(n: Int) {
    // Verifica se o parametro é igual a 2.
    if(n == 1){
        println("Siga")
    }
    else if (n == 2) {
        // Se for, printa a mensagem
        println("Pare")
    } else {
        // Se não for, printa outra mensagem
        println("Atencao")
    }
}