import java.util.*

class `1006_Average2` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val numberOne = leitor.nextDouble()
        val numberTwo = leitor.nextDouble()
        val numberTree = leitor.nextDouble()
        val avarage = (2 * numberOne + 3 * numberTwo + 5 * numberTree) / 10

        println("MEDIA = ${String.format("%.1f", avarage)}")

    }
}