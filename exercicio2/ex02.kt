package exercicio2

fun main() {
    println("Digite um parágrafo de texto:")

    val texto = readln()

    val palavras = texto.split("\\s+".toRegex())

    val contagemPalavras = palavras.size

    println("Número total de palavras: $contagemPalavras")
}