import java.util.*

class `1180_LowestNumberPosition` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberTest = reader.nextInt()
        var lowValue = 1000
        var position = 0

        for (i in 0 until numberTest) {
            var number = reader.nextInt()
            if (number < lowValue) {
                lowValue = number
                position = i
            }
        }
        println("Menor valor: $lowValue")
        println("Posicao: $position")
    }
}
