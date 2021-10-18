import java.util.*

class `1071_SumOfConsecutiveOddNumbersI` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var valueOne = reader.nextInt()
        var valueTwo = reader.nextInt()
        var aux: Int
        var sum = 0

        if (valueOne > valueTwo) {
            aux = valueTwo
            valueTwo = valueOne
            valueOne = aux
        }

        for (i in (valueOne + 1) until valueTwo) {
            if (i % 2 != 0) sum += i
        }
        println("$sum")
    }
}
