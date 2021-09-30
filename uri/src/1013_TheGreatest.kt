import java.util.*
import kotlin.math.abs

class `1013_TheGreatest` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val a = leitor.nextInt()
        val b = leitor.nextInt()
        val c = leitor.nextInt()
        val primeiroMaior = (a + b + abs(a - b)) / 2
        val maior = (primeiroMaior + c + abs(primeiroMaior - c)) / 2

        println("$maior eh o maior")
    }
}