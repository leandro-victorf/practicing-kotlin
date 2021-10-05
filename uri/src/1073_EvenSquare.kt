import java.util.*

class `1073_EvenSquare` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var number = reader.nextInt()

        if (number.mod(2) == 1) number++

        for (i in 2..number step 2) println("$i^$i = ${i*i}")
    }
}
