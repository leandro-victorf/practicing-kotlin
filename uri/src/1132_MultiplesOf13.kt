import java.util.*

class `1132_MultiplesOf13` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numberOne = reader.nextLong()
        var numberTwo = reader.nextLong()
        var aux: Long
        var sum = 0L

        if (numberOne > numberTwo) {
            aux = numberTwo
            numberTwo = numberOne
            numberOne = aux
        }

        for (i in numberOne..numberTwo) if (i.mod(13L) != 0L) {
            sum += i
        }
        println("$sum")
    }
}
