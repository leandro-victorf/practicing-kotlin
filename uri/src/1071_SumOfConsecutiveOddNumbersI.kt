import java.util.*

class `1071_SumOfConsecutiveOddNumbersI` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val valueOne = reader.nextInt()
        val valueTwo = reader.nextInt()
        var sum = 0

        for (i in valueOne..valueTwo step 2){
           sum += i
        }
        println(sum)
    }
}