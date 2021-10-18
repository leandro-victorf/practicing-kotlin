import java.util.*

class `1133_RestOfDivision` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numberOne = reader.nextInt()
        var numberTwo = reader.nextInt()
        var aux: Int

        if (numberOne > numberTwo) {
            aux = numberTwo
            numberTwo = numberOne
            numberOne = aux
        }

        for (i in numberOne..numberTwo) {
            if (i % 5 == 2 || i % 5 == 3) {
                if (i > 2) println("$i")
            }
        }
    }
}
