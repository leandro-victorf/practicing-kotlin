import java.util.*

class `1014_Consumption` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val distance = leitor.nextInt()
        val fuel = leitor.nextDouble()
        val kmL = distance / fuel

        println("${String.format("%.3f", kmL)} km/l")

    }
}