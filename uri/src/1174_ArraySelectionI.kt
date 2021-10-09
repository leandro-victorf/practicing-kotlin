import java.util.*

class `1174_ArraySelectionI` {

    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)

        for (i in 0 until 100) {
            var number = reader.nextDouble()
            if (number <= 10) {
                println("A[$i] = ${String.format("%.1f", number)}")
            }
        }
    }
}
