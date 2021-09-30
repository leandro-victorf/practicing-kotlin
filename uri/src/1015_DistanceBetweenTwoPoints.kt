import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class `1015_DistanceBetweenTwoPoints` {


    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val x1 = leitor.nextDouble()
        val y1 = leitor.nextDouble()
        val x2 = leitor.nextDouble()
        val y2 = leitor.nextDouble()
        val distance = sqrt((x1 - x2).pow(2.0) + (y1 - y2).pow(2.0))

        println(String.format("%.4f", distance))

    }
}