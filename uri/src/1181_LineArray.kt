import java.util.*

class `1181_LineArray` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val lineNumber = reader.nextInt()
        val operation = reader.next()
        var sum = 0.0
        var counter = 0

        for (i in 0..11) {
            var term = reader.nextDouble()
            sum += term
            counter++
        }

        if (operation.equals("S")) {
            println("${String.format("%.1f", sum)}")
        } else {
            println("${String.format("%.1f", (sum / counter))}")
        }
    }
}
