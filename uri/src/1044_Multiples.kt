import java.util.*

class `1044_Multiples` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()

        if (b.mod(a) == 0.0) {
            println("Sao Multiplos")
        } else if (a.mod(b) == 0.0) {
            println("Sao Multiplos")
        } else {
            println("Nao sao Multiplos")
        }
    }
}
