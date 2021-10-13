import java.util.*

class `1142_Pum` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberPrints = reader.nextInt()

        for (i in 1..(4 * numberPrints)) {
            if (i.mod(4) == 0) {
                println("PUM")
            } else {
                print("$i ")
            }
        }
    }
}
