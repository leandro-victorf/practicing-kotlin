import java.util.*

class `1019_TimeConversion` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val time = leitor.nextInt()
        val hour = (time - time.mod(3600))
        val minutes = time.mod(3600) - (time.mod(3600)).mod(60)
        val seconds = (time.mod(3600)).mod(60)

        println("${hour / 3600}:${minutes / 60}:$seconds")
    }
}