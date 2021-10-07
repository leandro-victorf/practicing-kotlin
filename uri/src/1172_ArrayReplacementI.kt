import java.util.*

class `1172_ArrayReplacementI` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numbers = mutableListOf<Int>()

        for (i in 0 until 10) {
            numbers.add(i, reader.nextInt())
            if (numbers[i] <= 0) {
                numbers[i] = 1
            }
            println("X[$i] = ${numbers[i]}")
        }
    }
}
