import java.util.*
import kotlin.math.abs

class `1478_SquareMatrixII` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var sizeMatrix = reader.nextInt()

        while (sizeMatrix > 0) {

            for (i in 0 until sizeMatrix) {
                for (j in 0 until sizeMatrix) {
                    print("  ${abs(i - j) + 1}")
                    if (i == (sizeMatrix - 1) && j == (sizeMatrix - 1)) println()
                    else print("")
                }
                println()
            }
            sizeMatrix = reader.nextInt()
        }
    }
}
