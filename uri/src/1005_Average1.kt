import java.util.*

class `1005_Average1` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val numberOne = leitor.nextDouble()
        val numberTwo = leitor.nextDouble()
        val avarage = (3.5 * numberOne + 7.5 * numberTwo) / 11

        println("MEDIA = ${String.format("%.5f", avarage)}")

    }
}