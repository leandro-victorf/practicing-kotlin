import java.util.*

class `1037_Interval` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val number = leitor.nextDouble()

        when (number) {
            in 0.00..25.00 -> println("Intervalo [0,25]")
            in 25.01..50.00 -> println("Intervalo (25,50]")
            in 50.01..75.00 -> println("Intervalo (50,75]")
            in 75.01..100.00 -> println("Intervalo (75,100]")
            else -> println("Fora de intervalo")
        }
    }
}
