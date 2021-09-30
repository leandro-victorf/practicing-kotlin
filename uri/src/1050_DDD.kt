import java.util.*

class `1050_DDD` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val ddd = leitor.nextInt()

        when (ddd) {
            61 -> println("Brasilia")
            71 -> println("Salvador")
            11 -> println("Sao Paulo")
            21 -> println("Rio de Janeiro")
            32 -> println("Juiz de Fora")
            19 -> println("Campinas")
            27 -> println("Vitoria")
            31 -> println("Belo Horizonte")
            else -> println("DDD nao cadastrado")
        }
    }
}
