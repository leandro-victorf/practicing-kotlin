import java.util.*

class `1008_Salary` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val number = leitor.nextInt()
        val hour = leitor.nextInt()
        val value = leitor.nextFloat()
        val salary = hour * value

        println("NUMBER = $number")
        println("SALARY = U$ ${String.format("%.2f", salary)}")

    }
}