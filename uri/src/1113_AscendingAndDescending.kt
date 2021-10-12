import java.util.*

class `1113_AscendingAndDescending` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)

        for (i in 1..8) {
            var numberOne = reader.nextInt()
            var numberTwo = reader.nextInt()
            if (numberOne > numberTwo) {
                println("Decrescente")
            } else if (numberOne < numberTwo) {
                println("Crescente")
            }
        }
    }
}
