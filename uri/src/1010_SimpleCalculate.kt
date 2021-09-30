import java.util.*

class `1010_SimpleCalculate` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val codeProduct1 = leitor.nextInt()
        val numberUnits1 = leitor.nextInt()
        val price1 = leitor.nextDouble()
        val codeProduct2 = leitor.nextInt()
        val numberUnits2 = leitor.nextInt()
        val price2 = leitor.nextDouble()
        val paid = numberUnits1 * price1 + numberUnits2 * price2

        println("VALOR A PAGAR: R$ ${String.format("%.2f", paid)}")

    }
}