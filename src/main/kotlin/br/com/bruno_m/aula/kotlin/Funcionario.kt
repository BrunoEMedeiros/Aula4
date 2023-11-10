package br.com.bruno_m.aula.kotlin

open class Funcionario(var salario: Float, nome: String, idade: Integer2){
    val ativo = true // Colaborador está ativo por padrão.
    val bonus get() = salario > 0 // Método para verificar se há bônus.
}