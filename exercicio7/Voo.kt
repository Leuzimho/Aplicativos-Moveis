package exercicio7

class Voo(val numeroDoVoo: Int, val totalAssentos: Int) {
    private val assentosDisponiveis: BooleanArray = BooleanArray(totalAssentos) { true }

    fun verificarDisponibilidade(assento: Int): Boolean {
        return if (assento in 1..totalAssentos) {
            assentosDisponiveis[assento - 1]
        } else {
            println("Número do assento inválido.")
            false
        }
    }

    fun reservarAssento(assento: Int): Boolean {
        return if (assento in 1..totalAssentos && assentosDisponiveis[assento - 1]) {
            assentosDisponiveis[assento - 1] = false
            println("Assento $assento reservado com sucesso.")
            true
        } else {
            println("Assento $assento não está disponível ou número do assento inválido.")
            false
        }
    }

    fun mostrarAssentosDisponiveis() {
        println("Assentos disponíveis no voo $numeroDoVoo:")
        for (i in assentosDisponiveis.indices) {
            if (assentosDisponiveis[i]) {
                print("${i + 1} ")
            }
        }
        println()
    }
}


