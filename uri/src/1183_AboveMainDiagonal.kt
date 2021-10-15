import java.util.*

class `1183_AboveMainDiagonal` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val operation = reader.next()
        val arrayNumbers = mutableListOf<MutableList<Double>>()
        var sum = 0.0

        for (i in 0..11){
            arrayNumbers.add(mutableListOf())
            for (j in 0..11){
                arrayNumbers[i].add(reader.nextDouble())
            }
        }

        for (i in 0..11) {
            for (j in (i + 1)..11) {
                sum += arrayNumbers[i][j]
            }
        }

        if (operation.equals("S"))
            println("${String.format("%.1f", sum)}")
        else
            println("${String.format("%.1f", (sum / 66))}")
    }
}
