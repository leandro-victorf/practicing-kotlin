class `1096_SequenceIJ2` {
    fun main(args: Array<String>) {
        var numberI = 1

        while (numberI < 10) {
            for (i in 7 downTo 5) println("I=$numberI J=$i")
            numberI += 2
        }
    }
}
