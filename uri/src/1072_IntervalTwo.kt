import java.util.*

class `1072_IntervalTwo` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val size = reader.nextInt()
        var numbers = mutableListOf<Int>()
        var counterIn = 0
        var counterOut = 0

        for(i  in 0 until size){
            numbers.add(i,reader.nextInt())
        }

        for (i in numbers) {
            if ( i >= 10 && i <= 20){
                counterIn++
            }else{
                counterOut++
            }
        }
        println("$counterIn in")
        println("$counterOut out")
    }
}