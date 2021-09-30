import java.util.*
import kotlin.math.pow

class `1012_Area` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val c = leitor.nextDouble()
        val pi = 3.14159
        val triangle = (a * c) / 2
        val area = (c.pow(2.0)) * pi
        val trapezium = (a + b) * c / 2
        val square = b.pow(2.0)
        val rectangle = a * b

        println("TRIANGULO: ${String.format("%.3f", triangle)}")
        println("CIRCULO: ${String.format("%.3f", area)}")
        println("TRAPEZIO: ${String.format("%.3f", trapezium)}")
        println("QUADRADO: ${String.format("%.3f", square)}")
        println("RETANGULO: ${String.format("%.3f", rectangle)}")

    }
}