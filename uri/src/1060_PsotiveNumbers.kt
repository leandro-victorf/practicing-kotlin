import java.util.*

class `1060_PsotiveNumbers` {

    fun main (args: Array<String>){
        val reader = Scanner(System.`in`)
        var counter = 0

        for(i in 1..6){
            var number = reader.nextDouble()
            if(number > 0){
                counter++
            }
        }
        println("$counter valores positivos")
    }
}