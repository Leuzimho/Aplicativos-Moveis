package exercicio1

fun main() {
    println("Digite um número:")

    val input = readln().toInt()

    val isPrime = if (input <= 1) {
        false
    } else {
        var prime = true
        for (i in 2..Math.sqrt(input.toDouble()).toInt()) {
            if (input % i == 0) {
                prime = false
                break
            }
        }
        prime
    }

    if (isPrime) {
        println("$input é um número primo.")
    } else {
        println("$input não é um número primo.")
    }
}
