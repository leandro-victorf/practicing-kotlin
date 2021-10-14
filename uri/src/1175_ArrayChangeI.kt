import java.util.*

class `1175_ArrayChangeI` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numberArray = mutableListOf<Int>()

        for (i in 0..19) {
            numberArray.add(i, reader.nextInt())
        }

        for (i in 19 downTo 0) {
            println("N[${19 - i}] = ${numberArray[i]}")
        }
    }
}
