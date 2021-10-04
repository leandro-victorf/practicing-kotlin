import java.util.*

class `1071_SumOfConsecutiveOddNumbersI` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val valueOne = reader.nextInt()
        val valueTwo = reader.nextInt()
        var start = 0
        var end = 0
        if (valueOne >= valueTwo){
            start = valueOne
            end = valueTwo
        }else {
            start = valueOne
            end = valueTwo
        }

        if (start.mod(2)  == 0){
            start += 1
        }
        if (end.mod(2)  == 0){
            end += 1
        }

        for (i in start..end step 2){
            println(i)
        }

    }
}