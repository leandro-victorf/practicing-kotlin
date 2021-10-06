import java.util.*

class `1114_FixedPassword` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var attempt = reader.nextInt()
        val password = 2002

        while (attempt != password){
            println("Senha Invalida")
            attempt = reader.nextInt()
        }

        println("Acesso Permitido")
    }
}
