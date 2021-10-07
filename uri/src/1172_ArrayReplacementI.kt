import java.util.*

class `1172_ArrayReplacementI` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numbers = mutableListOf<Int>()
        var counterIn = 0
        var counterOut = 0

        for (i in 0 until 10) {
            numbers.add(i, reader.nextInt())
        }

        for (i in 0 until 10) {
            println("$numbers")
        }

    }
}
