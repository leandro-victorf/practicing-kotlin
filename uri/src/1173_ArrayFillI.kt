import java.util.*
import kotlin.math.*

class `1173_ArrayFillI` {

    fun main(args: Array<String>){
        val reader = Scanner(System.`in`)
        val number = reader.nextInt()

        for ( i in 0 until 10){
            println("N[$i] = ${String.format("%.0f", number*(2.0.pow(i)))}")
        }
    }
}
