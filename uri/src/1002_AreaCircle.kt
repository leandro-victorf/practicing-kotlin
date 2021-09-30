import java.util.*
import kotlin.math.pow

class `1002_AreaCircle` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val raio = leitor.nextDouble()
        val pi = 3.14159
        val area = (raio.pow(2.0)) * pi

        println("A=${String.format("%.4f", area)}")

    }
}