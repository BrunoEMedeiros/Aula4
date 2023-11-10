
//fun main() {
//    //Define o valor da variavel
//    val myText = "Hello"
//
//    //Nesta variavel concatena a variavel myText com ela mesma
//    val newText1 = myText+" "+myText
//
//    //Utiliza outro método de concatenação
//    val newText2 = "$myText $myText"
//
//    //Printa a variavel MyText
//    println(myText)
//
//    //Printa a variavel newText1
//    println(newText1)
//
//    //Printa a variavel newText2
//    println(newText2)
//}
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