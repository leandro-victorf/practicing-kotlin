import java.util.*

class `1020_AgeDays` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val time = leitor.nextInt()
        val ano = (time - time.mod(365))
        val mes = time.mod(365) - (time.mod(365)).mod(30)
        val dia = (time.mod(365)).mod(30)

        println("${ano / 365} ano(s)")
        println("${mes / 30} mes(es)")
        println("${dia} dia(s)")
    }
}