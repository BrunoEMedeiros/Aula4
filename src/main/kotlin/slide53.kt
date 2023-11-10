

// Estou seguindo os slides e vou ser sincero, nos anteriores coloquei outras funcoes sem ser o IMC
// mas acabou minha criatividade kk

fun main() {
    val p1 = Pessoa("Alice", 1.65f, 55f) // Instância Pessoa.
    val p2 = Funcionario("Carlos", 1.80f, 80f, 2500f) // Instância Funcionário.
    val p3 = Estudante("Matemática", "David", 1.60f, 50f) // Instância Estudante.

    // Imprime o IMC de cada pessoa.
    println("${p1.nome} tem IMC = ${p1.imc()}")
    // Para o funcionário, verifica se recebe bônus.
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if (p2.bonus()) "recebe bônus" else "não recebe bônus"}")
    // Para o estudante, mostra o curso.
    println("${p3.nome} está cursando ${p3.curso} e tem IMC = ${p3.imc()}")
}

// Classe Pessoa com método para calcular o IMC.
open class Pessoa(val nome: String, val altura: Float, val peso: Float) {
    fun imc() = peso / (altura * altura) // Método de IMC.
}

// Classe Funcionário herda de Pessoa e adiciona salário.
class Funcionario(nome: String, altura: Float, peso: Float, var salario: Float) : Pessoa(nome, altura, peso) {
    fun bonus() = salario > 3000 // Método para bônus.
}

// Classe Estudante herda de Pessoa e adiciona curso.
class Estudante(var curso: String, nome: String, altura: Float, peso: Float) : Pessoa(nome, altura, peso)


