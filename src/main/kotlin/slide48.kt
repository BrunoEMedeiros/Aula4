

fun main() {
    val bruno = Funcionario("Lúcia", 1999) // Instância de Humano.
    val andre = Operario(2500f, "Rafael", 80f, 1.80f) // Instância de Operario.
    val danilo = Estagiario("História", "Gabriela", 50f, 1.60f) // Instância de Estagiario.

    // Imprime o IMC de cada humano.
    println("${bruno.idade()} tem: ${bruno.idade()} anos")
    // Para o operario, verifica se recebe bônus.
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if (p2.bonus()) "recebe bônus" else "não recebe bônus"}")
    // Para o estagiario, mostra o curso.
    println("${p3.nome} está cursando ${p3.curso} e tem IMC = ${p3.imc()}")
}

open class Funcionario(val nome: String, val ano_nascimento: Int) {
    fun idade() = 2023 - ano_nascimento // Método de IMC.
}

// Classe Operario herda de Pessoa e adiciona salário.
class Operario(var salario: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura) {
    fun bonus() = salario > 3000 // Método para bônus.
}

// Classe Estagiario herda de Pessoa e adiciona curso.
class Estagiario(var curso: String, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura)
