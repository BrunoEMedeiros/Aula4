

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


