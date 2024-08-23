package exercicio5
import kotlin.random.Random
fun main() {


    print("Quantas vezes deseja jogar o dado? ")
    var vezes = readln().toInt()

    for(i in 1..vezes){
        val dado1 = Random.nextInt(1, 7)
        val dado2 = Random.nextInt(1, 7)

        println("O valor do dado 1 é: $dado1")
        println("O valor do dado 2 é: $dado2")

        println("A soma obtida é: ${dado1 + dado2}\n")
    }


}