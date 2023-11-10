

fun main() {
    // Define o valor da variavel
    var a = 1 + 1
    //recebe retorno da funcao
    a = soma(a)
}

//  Funcao soma() que retorna um int
fun soma(param: Int):Int {
    // Abaixo vários modos de printar o parametro da função
    println("result: "+ param)
    println("result: $param")
    println("result: ${param}")
    println("result: ${param+1}")// printa o parametro +1
    
    return param //retorna valor parametro
}