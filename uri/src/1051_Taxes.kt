import java.util.*

class `1051_Taxes` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val salary = leitor.nextDouble()
        var tax = 0.00

        when (salary) {
            in 0.00..2000.00 -> tax = 0.00
            in 2000.01..3000.00 -> tax = (salary - 2000.00) * 0.08
            in 3000.01..4500.00 -> tax = 80.00 + (salary - 3000.00) * 0.18
            else -> tax = 350.00 + (salary - 4500.00) * 0.28
        }

        if (tax == 0.00) {
            println("Isento")
        } else {
            println("R$ ${String.format("%.2f", tax)}")
        }
    }
}
