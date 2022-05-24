/*
Your function receives two sets of Int. Return a new set of elements in the first set that are multiples of the size of the second set.

Sample Input 1:
10 11 14 16 2 1
2 1

Sample Output 1:
10 14 16 2
 */

fun main() {
    val firstSet = readLine()!!.split(" ").map { it.toInt() }.toSet()
    val secondSet = readLine()!!.split(" ").map { it.toInt() }.toSet()

    print(findMultiples(firstSet, secondSet).joinToString(" "))
}
fun findMultiples(first: Set<Int>, second: Set<Int>): Set<Int> {
    return first.filter { it % second.size == 0 }.toSet()
}