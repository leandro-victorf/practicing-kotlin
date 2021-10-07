import java.util.*

class `1134_TypeOfFuel` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var type = reader.nextInt()
        var counterAlcohol = 0
        var counterGasoline = 0
        var counterDiesel = 0
        var counterOther = 0

        while ( type != 4) {
            if (type == 1){
                counterAlcohol++
            }else if (type == 2){
                counterGasoline++
            }else if (type == 3){
                counterDiesel++
            }else {
                counterOther++
            }
            type = reader.nextInt()
        }

        println("MUITO OBRIGADO")
        println("Alcool: $counterAlcohol")
        println("Gasolina: $counterGasoline")
        println("Diesel: $counterDiesel")
    }
}
