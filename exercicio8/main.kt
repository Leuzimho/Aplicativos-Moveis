package exercicio8

fun main() {
    val produtos = mutableListOf<Produto>()

    for (i in 1..5) {
        println("Cadastro do produto $i:")

        print("Nome: ")
        val nome = readLine() ?: ""

        print("Quantidade atual: ")
        val quantidade = readLine()?.toIntOrNull() ?: 0

        print("Nível mínimo: ")
        val nivelMinimo = readLine()?.toIntOrNull() ?: 0

        print("Nível máximo: ")
        val nivelMaximo = readLine()?.toIntOrNull() ?: 0

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }

    produtos.forEach { it.verificarEstoque() }
}