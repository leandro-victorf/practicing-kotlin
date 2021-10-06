class `1097_SequenceIJ3` {
    fun main(args: Array<String>) {
        var numberI = 1
        var start = 7
        var end = 5

        while (numberI < 10) {
            for (i in start downTo end) println("I=$numberI J=$i")
            numberI += 2
            start += 2
            end += 2
        }
    }
}
