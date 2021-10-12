import java.util.*

class `1101_SequenceOfNumbersAndSum` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOne = reader.nextInt()
        val numberTwo = reader.nextInt()
        var sum = 0


        for (j in 1..3) {
            if (numberOne != 0 && numberTwo != 0) {

                for (i in numberTwo..numberOne) {
                    print("$i ")
                    sum += i
                }
                println("Sum=$sum")
            }
        }
    }
}
