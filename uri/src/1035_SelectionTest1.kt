import java.util.*

class `1035_SelectionTest1` {


    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val a = leitor.nextInt()
        val b = leitor.nextInt()
        val c = leitor.nextInt()
        val d = leitor.nextInt()

        when {
            b > c && d > a && c + d > a + b &&
                    b > 0 && d > 0 && a.mod(2) == 0 -> println("Valores aceitos")
            else -> println("Valores nao aceitos")
        }
    }
}
