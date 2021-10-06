import java.util.*

class `1115_Quadrant` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numberX = reader.nextInt()
        var numberY = reader.nextInt()
        while (numberX != null) {

            if (numberX > 0) {
                if (numberY > 0) {
                    println("primeiro")
                } else {
                    println("quarto")
                }
            } else if (numberX < 0) {
                if (numberY > 0) {
                    println("segundo")
                } else {
                    println("terceiro")
                }
            } else {
                println()
            }
            numberX = reader.nextInt()
            numberY = reader.nextInt()
        }
    }
}
