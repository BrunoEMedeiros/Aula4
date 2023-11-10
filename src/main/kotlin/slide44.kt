
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