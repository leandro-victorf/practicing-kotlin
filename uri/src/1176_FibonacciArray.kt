import java.util.*

class `1176_FibonacciArray` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        val numberOfTerm = reader.nextInt()
        var firstNumber = 1L
        var secoundNumber = 1L
        var sum = 1L

        for (i in 1..numberOfTerm) {
            var fibonacciNumber = reader.nextInt()
            if (fibonacciNumber == 0 || fibonacciNumber == 1) {
                println("Fib($fibonacciNumber) = $fibonacciNumber")
            } else {
                for (j in 1..(fibonacciNumber - 2)) {
                    sum = firstNumber + secoundNumber
                    firstNumber = secoundNumber
                    secoundNumber = sum
                }
                println("Fib($fibonacciNumber) = $sum")

            }
            firstNumber = 1L
            secoundNumber = 1L
            sum = 1L
        }
    }
}
