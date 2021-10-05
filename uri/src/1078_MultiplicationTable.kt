import java.util.*

class `1078_MultiplicationTable` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val number = reader.nextInt()

        for (i in 1..10) println("$i x $number = ${i * number}")
    }
}