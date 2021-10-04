import java.util.*

class `1070_SixOddNumbers` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val value = reader.nextInt()

        if (value.mod(2) == 0){
            println("${value + 1}")
            println("${value + 3}")
            println("${value + 5}")
            println("${value + 7}")
            println("${value + 9}")
            println("${value + 11}")
        }else {
            println("${value}")
            println("${value + 2}")
            println("${value + 4}")
            println("${value + 6}")
            println("${value + 8}")
            println("${value + 10}")
        }

    }
}