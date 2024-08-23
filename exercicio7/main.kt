package exercicio7


fun main() {
    val voo = Voo(numeroDoVoo = 123, totalAssentos = 10)

    while (true) {
        println("\nMenu:")
        println("1. Verificar disponibilidade de assento")
        println("2. Reservar assento")
        println("3. Mostrar assentos disponíveis")
        println("4. Sair")

        print("Escolha uma opção: ")
        val opcao = readLine()?.toIntOrNull()

        when (opcao) {
            1 -> {
                print("Digite o número do assento para verificar: ")
                val assento = readLine()?.toIntOrNull()
                if (assento != null) {
                    val disponivel = voo.verificarDisponibilidade(assento)
                    println("Assento $assento está ${if (disponivel) "disponível" else "indisponível"}.")
                } else {
                    println("Número do assento inválido.")
                }
            }

            2 -> {
                print("Digite o número do assento para reservar: ")
                val assento = readLine()?.toIntOrNull()
                if (assento != null) {
                    voo.reservarAssento(assento)
                } else {
                    println("Número do assento inválido.")
                }
            }

            3 -> voo.mostrarAssentosDisponiveis()
            4 -> break
            else -> println("Opção inválida. Tente novamente.")
        }
    }

}