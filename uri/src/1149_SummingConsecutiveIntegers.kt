import java.util.*

class `1149_SummingConsecutiveIntegers` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val number = reader.nextInt()
        var sizesequence = reader.nextInt()
        var sum = 0

        if (sizesequence <= 0) {
            sizesequence = reader.nextInt()
        } else {
            for (i in number until (number + sizesequence)) {
                sum += i
            }
            println(sum)
        }
    }
}
