fun population(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Expecting only positive numbers")
    var c = 0
    var x = n

    do {
        c += x and 1
        x = x shr 1

    } while (x != 0)
    return c
}
