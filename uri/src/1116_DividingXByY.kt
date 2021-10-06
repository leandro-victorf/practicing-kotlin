import java.util.*

class `1116_DividingXByY` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberDivision = reader.nextInt()
        var start = 1

        while (start <= numberDivision) {
            var numberX = reader.nextDouble()
            var numberY = reader.nextDouble()
            if (numberY == 0.0) {
                println("divisao impossivel")
            } else {
                println(String.format("%.1f", (numberX / numberY)))
            }
            start++
        }
    }
}
