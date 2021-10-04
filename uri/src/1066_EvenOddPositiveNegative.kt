import java.util.*

class `1066_EvenOddPositiveNegative` {

    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextDouble()
        val numberTwo = reader.nextDouble()
        val numberThree = reader.nextDouble()
        val numberFour = reader.nextDouble()
        val numberFive = reader.nextDouble()
        var counterEven = 0
        var counterOdd = 0
        var counterPositive = 0
        var counterNegative = 0
        val arrayNumbers = listOf(numberOne, numberTwo, numberThree, numberFour, numberFive)


        for (i in arrayNumbers) {
            if (i > 0.0) {
                counterPositive++
                if (i.mod(2.0) == 0.0) {
                    counterEven++
                } else {
                    counterOdd++
                }
            } else if (i < 0.0) {
                counterNegative++
                if (i.mod(2.0) == 0.0) {
                    counterEven++
                } else {
                    counterOdd++
                }
            } else {
                if (i.mod(2.0) == 0.0) {
                    counterEven++
                } else {
                    counterOdd++
                }
            }
        }

        println("$counterEven valor(es) par(es)")
        println("$counterOdd valor(es) impar(es)")
        println("$counterPositive valor(es) positivo(s)")
        println("$counterNegative valor(es) negativo(s)")
    }
}