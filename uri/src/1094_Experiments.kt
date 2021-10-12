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
            var stringType = reader.nextLine()

            when (stringType) {
                "C" -> {
                    counterRabbit += number
                    return
                }
                "R" -> {
                    counterMouse += number
                    return
                }
                "S" -> {
                    counterFrog += number
                    return
                }
            }
        }

        println("Total: ${counterRabbit + counterMouse + counterFrog} cobaias")
        println("Total de coelhos: $counterRabbit")
        println("Total de ratos: $counterMouse")
        println("Total de sapos: $counterFrog")

        if (counterRabbit != 0) {
            println(
                "Percentual de coelhos: ${
                    String.format(
                        "%.2f",
                        ((counterRabbit + counterMouse + counterFrog) / counterRabbit) * 100
                    )
                }%"
            )
        } else {
            println("Percentual de coelhos: 0.00 %")

        }

        if (counterMouse != 0) {
            println(
                "Percentual de ratos: ${
                    String.format(
                        "%.2f",
                        ((counterRabbit + counterMouse + counterFrog) / counterMouse) * 100
                    )
                }%"
            )
        } else {
            println("Percentual de ratos: 0.00 %")
        }

        if (counterFrog != 0) {
            println(
                "Percentual de sapos: ${
                    String.format(
                        "%.2f",
                        ((counterRabbit + counterMouse + counterFrog) / counterFrog) * 100
                    )
                }%"
            )
        } else {
            println("Percentual de sapos: 0.00 %")
        }
    }
}
