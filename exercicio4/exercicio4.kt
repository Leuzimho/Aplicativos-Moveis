package exercicio4

fun main() {
    val nomes = Array(10) { "" }
    for(i in 0 .. 9 ){
        print("Digite o nome do aluno ${1 + i}: ")
        nomes[i] = readln()
    }

    val nomesOrdenados = nomes.sorted()

    println("\nLista de alunos em ordem alfabética:")
    for ((index, nome) in nomesOrdenados.withIndex()) {
        println("${index + 1}. $nome")
    }
}