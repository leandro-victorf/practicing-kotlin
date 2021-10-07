import java.util.*

class `1144_LogicalSequence` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberPrints = reader.nextInt()

        for (i in 1..numberPrints) {
            print("$i ")
            print("${i*i} ")
            println("${i*i*i}")
            print("$i ")
            print("${i*i + 1} ")
            println("${i*i*i + 1}")
        }
    }
}