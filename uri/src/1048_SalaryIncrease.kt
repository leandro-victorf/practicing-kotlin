import java.util.*

class `1048_SalaryIncrease` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val salary = leitor.nextDouble()
        var readjustmentRate = 0

        when (salary) {
            in 0.00..400.00 -> readjustmentRate = 15
            in 400.01..800.00 -> readjustmentRate = 12
            in 800.01..1200.00 -> readjustmentRate = 10
            in 1200.01..2000.00 -> readjustmentRate = 7
            else -> readjustmentRate = 4
        }
        val newSalary = salary + salary * readjustmentRate / 100
        val readjustment = salary * readjustmentRate / 100

        println("Novo salario: ${String.format("%.2f", newSalary)}")
        println("Reajuste ganho: ${String.format("%.2f", readjustment)}")
        println("Em percentual: $readjustmentRate %")
    }
}
