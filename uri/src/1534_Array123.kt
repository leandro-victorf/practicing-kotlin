import java.util.*

class `1534_Array123` {
    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        var numberLine = reader.nextInt()

        do {
            for (i in 0 until numberLine) {
                for (j in 0 until numberLine) {
                    when (j) {
                        (numberLine - 1 - i) -> print(2)
                        i -> print(1)
                        else -> print(3)
                    }
                }
                println()
            }
            numberLine
        }while (numberLine != null)
    }
}

//val reader = Scanner(System.`in`)
//
//for (n in 1..100) {
//
//    var numberLine = reader.nextInt()
//    for (i in 0 until numberLine) {
//        for (j in 0 until numberLine) {
//            when (j) {
//                (numberLine - 1 - i) -> print(2)
//                i -> print(1)
//                else -> print(3)
//            }
//        }
//        println()
//    }
//}
