//fun main() {
//    // Cria instâncias da classe Pessoa com diferentes atributos.
//    val p1 = Pessoa("Maria", 60f, 1.70f)
//    val p2 = Pessoa("Joaquim", 70f, 1.75f)
//    val p3 = Pessoa("Marcos", 80f, 1.80f)
//
//    // Imprime o nome e o IMC de cada pessoa.
//    println("${p1.nome} tem IMC = ${p1.imc()}")
//    println("${p2.nome} tem IMC = ${p2.imc()}")
//    println("${p3.nome} tem IMC = ${p3.imc()}")
//}
//
//// Define a classe Pessoa com 3 parâmetros e um método para calcular o IMC.
//class Pessoa(val nome: String, val peso: Float, val altura: Float) {
//    // Método que calcula e retorna o IMC da pessoa.
//    fun imc() = peso / (altura * altura)
//}
fun main() {
    // Cria instâncias da classe Aluno com diferentes atributos.
    val a1 = Aluno(nome = "Bruno", nota1 = 9.1f, nota2 = 8.2f)
    val a2 = Aluno(nome = "Andre", nota1 = 9.0f, nota2 = 8.0f)
    val a3 = Aluno(nome = "Daniel", nota1 = 5.5f, nota2 = 6.0f)

    // Imprime o nome e a média de notas de cada aluno.
    println("${a1.nome} esta ${a1.media()}")
    println("${a2.nome} esta ${a2.media()}")
    println("${a3.nome} esta ${a3.media()}")
}

// Define a classe Aluno com três parâmetros e um método para calcular a média das notas.
class Aluno(val nome: String, val nota1: Float, val nota2: Float) {
    // Método que calcula e retorna a média aritmetica das notas do aluno.
    fun media() = if((nota1 + nota2) / 2 >= 6) "Aprovado" else if (nota1 + nota2) / 2 "Reprovado" else "Recuperação")
}