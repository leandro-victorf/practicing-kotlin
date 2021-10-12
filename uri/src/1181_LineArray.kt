import java.util.*

class `1181_LineArray` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val lineNumber = reader.nextInt()
        val operation = reader.next()
        var sum = 0.0

        for (i in 0..11) {
            var term = reader.nextDouble()
            sum += term
        }

        if (operation.equals("S")) {
            println("${String.format("%.1", sum)}")
        } else {
            println("${String.format("%.1", (sum / 12))}")
        }
    }
}
