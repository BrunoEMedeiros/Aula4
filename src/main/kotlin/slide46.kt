//fun main() {
//    // Executa a função passando o parametro 1.
//    mensagem(1)
//    // Executa a função passando o parametro 1.
//    mensagem(1)
//    // Executa a função passando o parametro 2.
//    mensagem(2)
//}
//
//fun mensagem(n: Int) {
//    // Verifica se o parametro é igual a 1.
//    if (n == 1) {
//        // Se for, printa "Feliz natal!"
//        println("Feliz natal!")
//    } else {
//        // Se não for, printa "Feliz aniversário!"
//        println("Feliz aniversário!")
//    }
//}
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