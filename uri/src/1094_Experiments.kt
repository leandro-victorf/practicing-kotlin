import java.util.*

class `1094_Experiments` {
    fun main(args: Array<String>) {

        val reader = Scanner(System.`in`)
        var numberTests = reader.nextInt()
        var counterRabbit = 0
        var counterMouse = 0
        var counterFrog = 0

        for (i in 1..numberTests) {
            var number = reader.nextInt()
            var stringType = reader.toString()

            when (stringType) {
                "C" -> {
                    counterRabbit += number
                }
                "R" -> {
                    counterMouse += number
                }
                "S" -> {
                    counterFrog += number
                }
            }
        }

        println("Total: ${counterRabbit + counterMouse + counterFrog} cobaias")
        println("Total de coelhos: $counterRabbit")
        println("Total de ratos: $counterMouse")
        println("Total de sapos: $counterFrog")
        println(
            "Percentual de coelhos: ${
                String.format(
                    "%.2f",
                    ((counterRabbit + counterMouse + counterFrog) / counterRabbit) * 100
                )
            }%"
        )
        println(
            "Percentual de ratos: ${
                String.format(
                    "%.2f",
                    ((counterRabbit + counterMouse + counterFrog) / counterMouse) * 100
                )
            }%"
        )
        println(
            "Percentual de sapos: ${
                String.format(
                    "%.2f",
                    ((counterRabbit + counterMouse + counterFrog) / counterFrog) * 100
                )
            }%"
        )

    }
}
