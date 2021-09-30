import java.util.*

class `1045_TriangleTypes` {

    fun main(args: Array<String>) {

        val leitor = Scanner(System.`in`)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val c = leitor.nextDouble()

        if (a + b <= c || a + c <= b || b + c <= a) {
            println("NAO FORMA TRIANGULO")
        } else {
            if (a * a == b * b + c * c || c * c == a * a + b * b || b * b == a * a + c * c) {
                println("TRIANGULO RETANGULO")
            } else {
                if (a * a > b * b + c * c || c * c > a * a + b * b || b * b > a * a + c * c) {
                    println("TRIANGULO OBTUSANGULO")
                    if (a == b || a == c || b == c) {
                        println("TRIANGULO ISOSCELES")
                    }
                } else {
                    println("TRIANGULO ACUTANGULO")
                    if (a == b && a == c && b == c) {
                        println("TRIANGULO EQUILATERO")
                    } else if (a == b || a == c || b == c) {
                        println("TRIANGULO ISOSCELES")
                    }
                }
            }
        }
    }
}
