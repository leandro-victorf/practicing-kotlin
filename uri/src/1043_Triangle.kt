import java.util.*

class `1043_Triangle` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val c = leitor.nextDouble()
        val ab = a + b
        val ac = a + c
        val bc = b + c

        if (ab > c && ac > b && bc > a) {
            val perimeter = a + b + c
            println("Perimetro = ${String.format("%.1f", perimeter)}")
        } else {
            val area = ((a + b) * c) / 2
            println("Area = ${String.format("%.1f", area)}")
        }
    }
}
