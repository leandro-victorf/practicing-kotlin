import java.util.*

class `1094_Experiments` {
    fun main(args: Array<String>) {

        val reader = Scanner(System.`in`)
        var numberTests = reader.nextInt()
        var counterRabbit: Double = 0.0
        var counterMouse: Double = 0.0
        var counterFrog: Double = 0.0

        for (i in 1..numberTests) {
            var number = reader.nextInt()
            var stringType = reader.nextLine().trim()

            when (stringType) {
                "C" -> {
                    counterRabbit += number
                }
                "R" -> {
                    counterMouse += number
                }
                else -> {
                    counterFrog += number
                }
            }
        }
        val total: Double = counterRabbit + counterMouse + counterFrog
        println("Total: ${total.toInt()} cobaias")
        println("Total de coelhos: ${counterRabbit.toInt()}")
        println("Total de ratos: ${counterMouse.toInt()}")
        println("Total de sapos: ${counterFrog.toInt()}")
        println("Percentual de coelhos: ${String.format("%.2f", (counterRabbit / total) * 100)} %")
        println("Percentual de ratos: ${String.format("%.2f", (counterMouse / total) * 100)} %")
        println("Percentual de sapos: ${String.format("%.2f", (counterFrog / total) * 100)} %")

    }
}
