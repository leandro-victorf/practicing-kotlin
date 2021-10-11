import java.util.*

class `1178_ArrayFillIII` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var value = reader.nextDouble()

        for (i in 0..99) {
            println("N[$i] = ${String.format("%.4f", value)}")
            value /= 2
        }
    }
}
