/*
You are given a MutableSet of integers and an integer as input. Check if the given integer is present in the MutableSet.
If so, return an empty Set. If not, just return the same set.
 */

fun main() {
    val setSource = readLine()!!.split(" ").map {it.toInt()}.toMutableSet()
    val input = readLine()!!.toInt()
    print(solution(setSource, input))
}

fun solution(elements: MutableSet<Int>, element: Int): MutableSet<Int> {
    if (elements.contains(element)) elements.clear() else elements
    return elements
}