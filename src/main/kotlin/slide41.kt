//fun main() {
//    // Declara a variável 'i' e inicializa com 0.
//    var i = 0
//
//    // Inicia um loop do-while que executa pelo menos uma vez.
//    do {
//        // Incrementa 'i' em 1 e printa seu valor seguido por vírgula.
//        print("${++i}, ")
//        // Continua o loop enquanto 'i' for menor que 10.
//    } while (i < 10)
//    // O loop termina quando 'i' atinge 10.
//}
fun main() {
    // Declara a variável 'contador' e inicializa com 5.
    var i = 5

    // Inicia um loop do-while
    do {
        // Printa o valor atual de 'contador' seguido por um ponto e vírgula.
        print("$i; ")
        // Diminui 'contador' de 1 em 1.
        contador--
        // Verifica se o contador é maior que 0.
    } while (i > 0)
    // O loop termina quando 'contador' é igual a 0.
}