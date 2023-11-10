
//fun main() {
//    // Cria três objetos da classe Pessoa com diferentes atributos
//    val p1 = Pessoas("Maria", 60f, 1.70f)
//    val p2 = Pessoas("Joaquim", 70f, 1.75f)
//    val p3 = Pessoas("Marcos", 80f, 1.80f)
//
//    // Imprime os objetos
//    println(p1)
//    println(p2)
//    // Força a conversão para String quando imprime
//    println(p3.toString())
//}
//
//// Declaração da classe Pessoa com um método toString()
//class Pessoas(var nome: String, var peso: Float, var altura: Float) {
//    // Sobrescreve a função toString()
//    override fun toString(): String {
//        return "$nome, $peso, $altura"
//    }
//}
fun main() {
    // Cria uma lista de objetos da classe Individuo com diferentes atributos.
    val individuos = listOf(
            Individuo("Bruno", 58f, 1.65f),
            Individuo("Teste", 90f, 1.80f),
            Individuo("Fernanda", 65f, 1.70f)
    )

    // Imprime as informações dos objetos Individuo.
    individuos.forEach { println(it) }
}

class Individuo(var nome: String, var peso: Float, var altura: Float) {

    // Sobrecarregando o método toString, muda a forma como o objeto é impresso.
    override fun toString(): String {
        return "Nome: $nome, Peso: $peso kg, Altura: $altura m"
    }
}


