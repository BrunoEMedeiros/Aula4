//fun main() {
//    // Declara-se varíaveis para armazenar nota e o resultado
//    val nota = 4
//    var resultado: String // define como String
//    //Uma estrutura condicional para definir se o aluno é aprovado ou reprovado
//    if (nota >= 6)//se maior ou igual a 6
//        resultado = "Aprovado"
//    else if (nota < 4) // nota menor que 4
//        resultado = "Reprovado"
//    else
//        resultado = "Recuperacao"
//
//    println(resultado) // printa o resultado
//}

fun main() {
    // Declara-se varíaveis para armazenar nota e o resultado
    val nota = 4
    var resultado: String // define como String

    resultado = result(nota)// variavel recebe o retorno da funcao
    println(resultado) // printa o resultado
}

fun result(param: Int):String {
    if (param >= 7)//se maior ou igual a 6
        return "Aprovado"
    else if (param < 5) // nota menor que 4
        return "Reprovado"
    else
        return "Recuperacao"
}