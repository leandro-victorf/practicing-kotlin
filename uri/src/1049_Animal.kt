import java.util.*

class `1049_Animal` {

    fun main(args: Array<String>) {
        val leitor = Scanner(System.`in`)
        val familia = leitor.nextLine()
        val classe = leitor.nextLine()
        val filo = leitor.nextLine()

        if (familia.equals("vertebrado")) {
            if (classe.equals("ave")) {
                if (filo.equals("carnivoro")) {
                    println("aguia")
                } else {
                    println("pomba")
                }
            } else {
                if (filo.equals("onivoro")) {
                    println("homem")
                } else {
                    println("vaca")
                }
            }
        } else {
            if (classe.equals("inseto")) {
                if (filo.equals("hematofago")) {
                    println("pulga")
                } else {
                    println("lagarta")
                }
            } else {
                if (filo.equals("hematofago")) {
                    println("sanguessuga")
                } else {
                    println("minhoca")
                }
            }
        }
    }
}
