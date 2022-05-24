/*
Complete the evenFilter() function that takes a Set of Int and returns a new set containing only the even elements from that set.
Don't use the += operator: work with MutableSet because it is faster than reassigning.
 */

fun main() {
    val sequence = readLine()!!.split(" ").map { it.toInt() }.toSet()

    print(evenFilter(sequence).joinToString(" "))

}

fun evenFilter(numbers: Set<Int>): Set<Int> {
    return numbers.filter { it % 2 == 0 }.toSet()
}

