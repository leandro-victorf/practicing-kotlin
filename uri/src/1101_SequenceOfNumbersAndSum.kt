import java.util.*

class `1101_SequenceOfNumbersAndSum` {
    fun main(args: Array<String>) {

        val reader = Scanner(System.`in`)
        var numberOne: Int
        var numberTwo: Int
        var aux: Int

        do {
            numberOne = reader.nextInt()
            numberTwo = reader.nextInt()
            var sum = 0

            if (numberOne > numberTwo) {
                aux = numberTwo
                numberTwo = numberOne
                numberOne = aux
            }

            if (numberOne > 0 && numberTwo > 0) {
                for (i in numberOne..numberTwo) {
                    print("$i ")
                    sum += i
                }
                println("Sum=$sum")
            }
        } while (numberOne > 0 && numberTwo > 0)
    }
}
