import java.util.*
import kotlin.math.pow

class `1011_Sphere` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val radius = leitor.nextDouble()
        val pi = 3.14159
        val volume = (((radius.pow(3.0)) * pi) * 4) / 3

        println("VOLUME = ${String.format("%.3f", volume)}")

    }
}