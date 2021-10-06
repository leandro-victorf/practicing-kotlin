import java.util.*

class `1117_ScoreValidation` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var counter = 0
        var average = 0.0
        while (counter < 2) {
            var score = reader.nextDouble()
            if (score < 0.0 || score > 10.0) {
                println("nota invalida")
                counter
            } else {
                average += score
                counter++
                if (counter == 2) {
                    println("media = ${String.format("%.2f", (average / 2))}")
                } else {
                    counter
                }

            }
        }
    }
}
