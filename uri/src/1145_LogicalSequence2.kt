import java.util.*

class `1145_LogicalSequence2` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val sizeLine = reader.nextInt()
        val numberTerm = reader.nextInt()

        for (i in 1..numberTerm) {
            print("$i ")
            if (i.mod(sizeLine) == 0) println()
        }
    }
}
