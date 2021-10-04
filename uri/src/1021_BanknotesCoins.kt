import java.util.*

class `1021_BanknotesCoins` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val value = leitor.nextDouble()
        val notasCem = value - value.mod(100)
        val notasCinquenta = value.mod(100) - (value - notasCem).mod(50)
        val notasVinte = (value - notasCem).mod(50) - (value - notasCem - notasCinquenta).mod(20)
        val notasDez =
            (value - notasCem - notasCinquenta - notasVinte) - (value - notasCem - notasCinquenta - notasVinte).mod(10)
        val notasCinco =
            (value - notasCem - notasCinquenta - notasVinte - notasDez) - (value - notasCem - notasCinquenta - notasVinte).mod(
                5
            )
        val notasDois =
            (value - notasCem - notasCinquenta - notasVinte - notasDez - notasCinco) - (value - notasCem - notasCinquenta - notasVinte - notasDez - notasCinco).mod(
                2
            )
        val moedasUm =
            (value - notasCem - notasCinquenta - notasVinte - notasDez - notasCinco - notasDois) - (value - notasCem - notasCinquenta - notasVinte - notasDez - notasCinco - notasDois).mod(
                1
            )
        val moedasCinquenta = value.mod(1) - (value.mod(1)).mod(0.50)
        val moedasVinteCinco = (value.mod(1) - moedasCinquenta) - (value.mod(1) - moedasCinquenta).mod(0.25)
        val moedasDez =
            (value.mod(1) - moedasCinquenta - moedasVinteCinco) - (value.mod(1) - moedasCinquenta - moedasVinteCinco).mod(
                0.10
            )
        val moedasCinco =
            (value.mod(1) - moedasCinquenta - moedasVinteCinco - moedasDez) - (value.mod(1) - moedasCinquenta - moedasVinteCinco - moedasDez).mod(
                0.05
            )
        val moedasZeroUm = value.mod(1) - moedasCinquenta - moedasVinteCinco - moedasDez - moedasCinco

        println("NOTAS:")
        println("${(notasCem / 100).toInt()} nota(s) de R$ 100.00")
        println("${(notasCinquenta / 50).toInt()} nota(s) de R$ 50.00")
        println("${(notasVinte / 20).toInt()} nota(s) de R$ 20.00")
        println("${(notasDez / 10).toInt()} nota(s) de R$ 10.00")
        println("${(notasCinco / 5).toInt()} nota(s) de R$ 5.00")
        println("${(notasDois / 2).toInt()} nota(s) de R$ 2.00")
        println("MOEDAS:")
        println("${moedasUm.toInt()} moeda(s) de R$ 1.00")
        println("${(moedasCinquenta / 0.50).toInt()} moeda(s) de R$ 0.50")
        println("${(moedasVinteCinco / 0.25).toInt()} moeda(s) de R$ 0.25")
        println("${(moedasDez / 0.10).toInt()} moeda(s) de R$ 0.10")
        println("${(moedasCinco / 0.05).toInt()} moeda(s) de R$ 0.05")
        println("String.format("%.0f", moedasZeroUm / 0.01) moeda(s) de R$ 0.01")
    }
}