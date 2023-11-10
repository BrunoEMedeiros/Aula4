//fun main() {
//    // Declara a variável nota
//    val nota = 4
//
//    // Usa uma expressão condicional para determinar a aprovação ou reprovação do aluno
//    if (nota >= 6) {
//        // O aluno é aprovado
//        println("Aprovado")
//    } else {
//        // O aluno é reprovado
//        println("Reprovado")
//    }
//}
fun main() {
    // Declara a variável nota
    val nota = 4
    val resultado: String

    println(resultado(nota)) //printa o retorno da funcao
}

fun resultado(param: Int):String {
    // Usa uma expressão condicional para determinar a aprovação ou reprovação do aluno
    if (param >= 7) {
        // O aluno é aprovado
        return "Aprovado"
    } else {
        // O aluno é reprovado
        return "Reprovado"
    }
}
