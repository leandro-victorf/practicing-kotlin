import java.util.*

class `1073_EvenSquare` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val number = reader.nextLong()

        for (i in 2..number step 2) {
            println("$i^2 = ${i * i}")
        }
    }
}
