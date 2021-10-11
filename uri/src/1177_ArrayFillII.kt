import java.util.*

class `1177_ArrayFillII` {
    fun main (args: Array<String>){
        val reader = Scanner(System.`in`)
        val number = reader.nextInt()

        for (i in 0..1000) println("N[$i] = ${i.mod(number)}")
    }
}