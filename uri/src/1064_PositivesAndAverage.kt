import java.util.*

class `1064_PositivesAndAverage` {

    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextDouble()
        val numberTwo = reader.nextDouble()
        val numberThree = reader.nextDouble()
        val numberFour = reader.nextDouble()
        val numberFive = reader.nextDouble()
        val numberSix = reader.nextDouble()
        var sum = 0.0
        var counter = 0
        val arrayNumbers = listOf(numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix)


        for (i in arrayNumbers) {
            if (i > 0.0) {
                sum += i
                counter++
            }
        }
        val average = sum / counter
        println("$counter valores positivos")
        println(String.format("%.1f", average))
    }
}
