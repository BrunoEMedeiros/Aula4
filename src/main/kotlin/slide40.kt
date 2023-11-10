
fun main() {
    // Declara uma lista para armazenar os números de telefone.
    val numeros = ArrayList<String>()
    numeros.add("42342")
    numeros.add("23")
    numeros.add("543675")
    numeros.add("132")
    numeros.add("87659")
    numeros.add("65")
    numeros.add("824")


    // Printa os números de telefone na ordem original.
    telefones.forEach { println(it) }
    println("_____________")

    // Ordena os números de telefone em ordem crescente.
    telefones.sort()

    // Printa os números de telefone em ordem crescente.
    telefones.forEach { println(it) }
    println("_____________")

    // Ordena os números de telefone em ordem inversa.
    telefones.sortDescending()

    // Printa os números de telefone em ordem inversa.
    telefones.forEach { println(it) }
}