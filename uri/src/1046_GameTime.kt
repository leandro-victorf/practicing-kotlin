import java.util.*

class `1046_GameTime` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val time1 = leitor.nextInt()
        val time2 = leitor.nextInt()

        if (time1 >= time2) {
            val time = 24 - time1 + time2
            println("O JOGO DUROU $time HORA(S)")
        } else {
            val time = time2 - time1
            println("O JOGO DUROU $time HORA(S)")
        }
    }
}
