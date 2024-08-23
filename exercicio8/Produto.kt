package exercicio8

class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {
    fun reporEstoque() {
        println("Reposição automática: Repondo o estoque do produto $nome para o nível máximo ($nivelMaximo unidades).")
        quantidade = nivelMaximo
    }

    fun verificarEstoque() {
        if (quantidade < nivelMinimo) {
            println("Estoque baixo: O produto $nome está abaixo do nível mínimo ($nivelMinimo unidades).")
            reporEstoque()
        } else {
            println("O produto $nome tem $quantidade unidades, acima do nível mínimo.")
        }
    }
}