import java.util.*

class `1101_SequenceOfNumbersAndSum` {
    fun main(args: Array<String>) {

        val reader = Scanner(System.`in`)

        for (j in 1..3) {
            var numberOne = reader.nextInt()
            var numberTwo = reader.nextInt()
            var sum = 0

            if (numberTwo > 0) {
                for (i in numberTwo..numberOne) {
                    print("$i ")
                    sum += i
                }
                println("Sum=$sum")
            }
        }
    }
}
