import java.util.*

class `1132_MultiplesOf13` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextInt()
        val numberTwo = reader.nextInt()
        var sum = 0

        for (i in numberOne..numberTwo) {
            if (i.mod(13) == 0) {
                sum += i
            }
        }

        println("$sum")
    }
}
