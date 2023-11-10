//fun main() {
//    // Cria um array  com os valores 10, 20, 30 e 50.
//    var valores = arrayOf(10, 20, 30, 50)
//
//    // Verifica se o número 20 está contido no array 'valores'.
//    if (20 in valores) {
//        // Se sim, printa a mensagem.
//        println("O vetor contém o buscado!")
//    }
//}
fun main() {
    // Cria um array contendo idiomas.
    var idiomas = arrayOf("Português", "Inglês", "Espanhol", "Francês")

    // Verifica se o idioma "Inglês" está contido no array 'idiomas'.
    if ("Russo" in idiomas) {
        // Se "Inglês" está no array, printa a mensagem.
        println("O array contém o idioma buscado!")
    }
    else
    {
        // Senão, printa a mensagem.
        println("Não contém o idioma no array!")
    }

}