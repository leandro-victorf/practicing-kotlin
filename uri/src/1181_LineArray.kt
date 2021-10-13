import java.util.*

class `1181_LineArray` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val lineNumber = reader.nextInt()
        val operation = reader.next()
        val arrayNumbers = mutableListOf<Double>()
        var sum = 0.0
        var counter = 0

        for (i in 0..143) arrayNumbers.add(i, reader.nextDouble())

        for (i in (12 * lineNumber)..(12 * lineNumber + 11)) {
            sum += arrayNumbers[i]
            counter++
        }

        if (operation.equals("S")) {
            println("${String.format("%.1f", sum)}")
        } else {
            println("${String.format("%.1f", (sum / counter))}")
        }
    }
}
