import java.util.*
import kotlin.math.abs

class `1478_SquareMatrixII` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)

        for (n in 1..5) {
            var sizeMatrix = reader.nextInt()
            if (sizeMatrix == 0) print("")
            else {
                for (i in 0 until sizeMatrix) {
                    for (j in 0 until sizeMatrix) {
                        if (j == (sizeMatrix - 1)) println("${abs(i - j) + 1}")
                        else print("${abs(i - j) + 1} ")

                        if (i == (sizeMatrix - 1) && j == (sizeMatrix - 1)) println()
                    }
                    println()
                }
            }
        }
    }
}
