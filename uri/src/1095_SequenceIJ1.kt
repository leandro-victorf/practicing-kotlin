class `1095_SequenceIJ1` {
    fun main(args: Array<String>) {
        var numberI = 1
        var numberJ = 60

        while (numberJ >= 0) {
            println("I=$numberI J=$numberJ")
            numberJ -= 5
            numberI += 3
        }
    }
}
