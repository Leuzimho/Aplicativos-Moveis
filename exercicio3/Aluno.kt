package exercicio3

class Aluno(val nome : String, val notas : Array<Double>) {

    fun calcularMedia(): Double{
        return notas.sum() / notas.size
    }

    fun foiAprovado(): Boolean {
        return calcularMedia() >= 7.0
    }
}