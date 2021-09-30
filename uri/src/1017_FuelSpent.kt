import java.util.*

class `1017_FuelSpent` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val time = leitor.nextDouble()
        val speed = leitor.nextDouble()
        val liter = speed * time / 12

        println(String.format("%.3f", liter))
    }
}