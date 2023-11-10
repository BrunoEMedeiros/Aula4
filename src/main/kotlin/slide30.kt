/*fun main() {
// Define-se uma string a variavel
    val myText = "Hello"
// Printa o conteúdo da variavel
    println(myText)
// Printa o primeiro caractere da variavel
    println(myText[0])
// Printa o segundo caractere da variavel
    println(myText[1])
// Printa o primeiro caractere da variavel usando o método get()
    println(myText.get(0))
// Printa o segundo caractere da varivel usando o método get()
    println(myText.get(1))
// Converte valor da variavel para minuscula
    println(myText.toLowerCase())
// Converte o valor da variavel para maiscula
    println(myText.toUpperCase())
// Printa o tamanho da variavel
    println(myText.length)
// Verifica e printa se o valor da variavel é igual a "hello"
    println(myText.equals("hello"))
// Verifica e printa se se o valor da variavel é igual a "hello" usando o operador == agora
    println(myText == "hello")
// Verifica e printa se o valor da variavel começa com "H"
    println(myText.startsWith(prefix = "H"))
// Verifica e printa se o valor da variavel termina com "H"
    println(myText.endsWith(suffix = "H"))
// printa os caracteres do valor da variavel entre o indice 0 e 2 da variavel
    println(myText.substring(0, 2))
}*/

fun main () {
    //Define-se uma string a variavel
    val conteudo = "qualquer"

    //Verifica se o valor da variavel é maior que 10
    if(conteudo.length > 10)
    {
        print("Quer escrever tanto, lanca um livro!") //printa a mensagem
    }
    else //caso não
    {
        //Verifica se o valor da variavel é ""cucamonga
        if(conteudo == "qualquer")
        {
            //Foi definido uma mensagem com diferentes valores a partir da variavel.
            //Foi usado o método uppercase() para deixar em caixa alta o valor da variavel
            //Length para usar o tamanho da variavel e usado o método equals para fazer um comparativo
            println("Aqui estou colocando um texto "+conteudo.uppercase()+" nao sei mais oque falar " +
                    "esta palavra tem "+conteudo.length+" letras, te garanto que é um texto "+conteudo.equals("cucamonga"))
        }
        else // caso não
        {
            print("Errou")
        }
    }

}