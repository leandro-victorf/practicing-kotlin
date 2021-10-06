import java.util.*

class `1113_AscendingAndDescending` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextInt()
        val numberTwo = reader.nextInt()

        if (numberOne > numberTwo) {
            println("Decrescente")
        } else if (numberOne < numberTwo) {
            println("Crescente")
        }
    }
}
