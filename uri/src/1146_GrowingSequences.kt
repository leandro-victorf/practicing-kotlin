import java.util.*

class `1146_GrowingSequences` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)

        for (i in 1..100) {
            val number = reader.nextInt()
            for (i in 1..number) print(i)
            println()
        }
    }
}
