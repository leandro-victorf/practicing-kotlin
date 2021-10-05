import java.util.*

class `1075_RemainingTwo` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val number = reader.nextInt()

        for (i in 1..10000) {
            if (i.mod(number) == 2) println(i)
        }
    }
}