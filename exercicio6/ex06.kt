fun main() {
    val temperaturas = DoubleArray(30)

    for (i in temperaturas.indices) {
        println("Digite a temperatura do dia ${i + 1}:")
        temperaturas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }


    val temperaturaMedia = temperaturas.average()


    val temperaturaMaxima = temperaturas.maxOrNull() ?: 0.0
    val diaMaxima = temperaturas.indexOf(temperaturaMaxima) + 1


    val temperaturaMinima = temperaturas.minOrNull() ?: 0.0
    val diaMinima = temperaturas.indexOf(temperaturaMinima) + 1


    println("Temperatura média do mês: $temperaturaMedia°C")
    println("Temperatura máxima do mês: $temperaturaMaxima°C, ocorrida no dia $diaMaxima")
    println("Temperatura mínima do mês: $temperaturaMinima°C, ocorrida no dia $diaMinima")
}
