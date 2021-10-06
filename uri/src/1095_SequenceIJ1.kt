class `1095_SequenceIJ1` {
    fun main(args: Array<String>) {
        var numberI = 1
        var numberJ = 60

        println("I=$numberI J=$numberJ")
        while (numberJ > 0) {
            numberJ -= 5
            numberI += 3
        }
        do println("I=$numberI J=$numberJ")
    }
}
