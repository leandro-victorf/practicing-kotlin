import java.util.*

class `1042_SimpleSort` {


    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val number1 = leitor.nextInt()
        val number2 = leitor.nextInt()
        val number3 = leitor.nextInt()
        var maior = 0
        var menor = 0
        var maiorTotal = 0
        var menorTotal = 0

        if (number1 > number2) {
            maior = number1
            menor = number2
        } else {
            maior = number2
            menor = number1
        }

        if (maior > number3) {
            maiorTotal = maior
            maior = number3
        } else {
            maiorTotal = number3
        }

        if (maior < menor) {
            menorTotal = maior
            maior = menor
        } else {
            menorTotal = menor
        }
        println("$menorTotal")
        println("$maior")
        println("$maiorTotal")
        print('\n')
        println("$number1")
        println("$number2")
        println("$number3")
    }
}
