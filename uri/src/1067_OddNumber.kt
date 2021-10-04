import java.util.*

class `1067_OddNumber` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val value = reader.nextInt()

//        for (i in 1..value step 2) println(i)
        (1..value).forEach { i -> if (i.mod(2) == 1) println(i) }
    }
}


