import java.util.*

class `1074_EvenOdd` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val size = reader.nextInt()
        var numbers = mutableListOf<Int>()

        for (i in 0 until size) {
            numbers.add(i, reader.nextInt())
        }

        for (i in numbers) {
            if (i > 0) {
                if (i.mod(2) == 0) println("EVEN POSITIVE")
                else println("ODD POSITIVE")
            } else if (i < 0) {
                if (i.mod(2) == 0) println("EVEN NEGATIVE")
                else println("ODD NEGATIVE")
            } else println("NULL")
        }
    }
}
