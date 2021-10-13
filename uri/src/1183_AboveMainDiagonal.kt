import java.util.*

class `1183_AboveMainDiagonal` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val operation = reader.next()
        val arrayNumbers = mutableListOf<Double>()
        var sum = 0.0

        for (i in 0..11){
            for (j in 0..11){
                arrayNumbers.add(j,  reader.nextDouble())
            }
        }

        for (i in 0..11){
            for (j in (i+1)..11){
                sum += arrayNumbers[j]
            }
        }

        if (operation.equals("S")) println("${String.format("%.1f", sum)}") else println("${String.format("%.1f", (sum / 66))}")
    }
}