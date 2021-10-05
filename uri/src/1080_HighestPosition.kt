import java.util.*

class `1080_HighestPosition` {
    fun main(args: Array<String>) {

        val reader = Scanner(System.`in`)
        var bigger = 0
        var position = 0

        for (i in 1..100){
            var number = reader.nextInt()
            if (number > bigger){
                bigger = number
                position = i
            }
        }

    }
}