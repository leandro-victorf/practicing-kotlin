import java.util.*

class `1041_CoordinatesPoint` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val x = leitor.nextDouble()
        val y = leitor.nextDouble()

        if (x == 0.0) {
            if (y == 0.0) {
                println("Origem")
            } else {
                println("Eixo Y")
            }
        } else if (x > 0.0) {
            if (y > 0.0) {
                println("Q1")
            } else if (y < 0.0) {
                println("Q4")
            } else {
                println("Eixo X")
            }
        } else {
            if (y > 0.0) {
                println("Q2")
            } else if (y < 0.0) {
                println("Q3")
            } else {
                println("Eixo X")
            }
        }
    }
}
