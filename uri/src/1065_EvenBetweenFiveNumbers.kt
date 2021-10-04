import java.util.*

class `1065_EvenBetweenFiveNumbers` {

    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextDouble()
        val numberTwo = reader.nextDouble()
        val numberThree = reader.nextDouble()
        val numberFour = reader.nextDouble()
        val numberFive = reader.nextDouble()
        var sum = 0.0
        var counter = 0
        val arrayNumbers = listOf(numberOne, numberTwo, numberThree, numberFour, numberFive)


        for (i in arrayNumbers) {
            if (i.mod(2.0) == 0.0) {
                counter++
            }
        }
        println("$counter valores pares")
    }
}
