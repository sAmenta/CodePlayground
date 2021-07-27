//Given a Set and an Array of strings,
//return true if all the elements in the Array occur in the Set; otherwise, return false.

fun main() {
    val first = setOf("A", "B", "C", "D")
    val last = arrayOf("A", "B", "C", "D")

    print(solution(first,last))
}

fun solution(first: Set<String>, second: Array<String>): Boolean {
    return second.toSet().containsAll(first)
}