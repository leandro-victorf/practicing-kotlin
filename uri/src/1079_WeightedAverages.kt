import java.util.*

class `1079_WeightedAverages` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberTests = reader.nextInt()

        for (i in 1..numberTests) {
            var numberOne = reader.nextDouble()
            var numberTwo = reader.nextDouble()
            var numberThree = reader.nextDouble()
            val average = (2 * numberOne + 3 * numberTwo + 5 * numberThree) / 10
            println(String.format("%.1f", average))
        }

    }
}