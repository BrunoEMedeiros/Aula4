

fun main() {
    //Define o valor da variavel
    val texto = "Olha"

    //É armazenado na variavel o retono da funcao junta_texto
    val novo_texto = junta_texto(texto)

    //Printa o valor da variavel texto
    println(texto)

    //Printa o valor da variavel nTexto
    println(novo_texto)

}

//Função que retorna o parametro concatenado com texto fixo
fun junta_texto(param: String): String{
    return "$param para cima"
}