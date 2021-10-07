import java.util.*
import kotlin.math.pow

class `1143_SquaredCubic` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberPrints = reader.nextInt()

        for (i in 1..numberPrints) {
            print("$i ")
            print("${i*i} ")
            println("${i*i*i}")
        }
    }
}



