import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class `1036_Bhaskara'sFormula` {


    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val c = leitor.nextDouble()
        val delta = b.pow(2.0) - 4 * a * c

        if (a == 0.0) {
            println("Impossivel calcular")
        } else {
            if (delta < 0) {
                println("Impossivel calcular")
            } else {
                val r1 = (-1 * b + sqrt(delta)) / (2 * a)
                val r2 = (-1 * b - sqrt(delta)) / (2 * a)
                println("R1 = ${String.format("%.5f", r1)}")
                println("R2 = ${String.format("%.5f", r2)}")
            }
        }
    }

}