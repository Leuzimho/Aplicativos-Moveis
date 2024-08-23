package exercicio3

fun main() {
    val alunos = mutableListOf<Aluno>()

    // Solicita o cadastro de 5 alunos
    for (i in 1..5) {
        println("Cadastro do aluno $i:")

        print("Digite o nome do aluno: ")
        val nome = readln()

        print("Digite o número de notas: ")
        val numNotas = readln().toInt()

        val notas = DoubleArray(numNotas)
        for (j in 0 until numNotas) {
            print("Digite a nota ${j + 1}: ")
            notas[j] = readln().toDouble()
        }

        // Cria uma instância da classe Aluno e adiciona à lista
        val aluno = Aluno(nome, notas.toTypedArray())
        alunos.add(aluno)
        println()
    }

    // Exibe as informações dos alunos
    for (aluno in alunos) {
        val media = aluno.calcularMedia()
        val status = if (aluno.foiAprovado()) "Aprovado" else "Reprovado"
        println("Nome: ${aluno.nome}")
        println("Média: ${"%.2f".format(media)}")
        println("Status: $status")
        println()
    }

}