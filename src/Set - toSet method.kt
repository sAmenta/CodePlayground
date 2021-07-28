//Given an Array of Strings in the input, convert it to Set.

fun main() {
    val strings = arrayOf("A", "B", "C", "D", "A")

    print(solution(strings).joinToString())
}
fun solution(strings: Array<String>): Set<String> {
    return strings.toSet()
}

//output: A, B, C, D