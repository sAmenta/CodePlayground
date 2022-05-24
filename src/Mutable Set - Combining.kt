/*
You are given a Set and a MutableList of strings as input. Combine them into a MutableSet and return the result.

 */

fun main() {
    val setSource = readLine()!!.split(" ").toSet()
    val listSource = readLine()!!.split(" ").toMutableList()

    print(solution(setSource, listSource).joinToString(" "))
}
fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val mutableSetSource = setSource.toMutableList() + listSource
    return mutableSetSource.toMutableSet()
}