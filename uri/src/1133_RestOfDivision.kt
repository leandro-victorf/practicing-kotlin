import java.util.*

class `1133_RestOfDivision` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextInt()
        val numberTwo = reader.nextInt()
        var sum = 0

        for (i in numberOne..numberTwo) {
            if (i.mod(5) == 2 || i.mod(5) == 3) {
                println("$i")
            }
        }
    }
}
