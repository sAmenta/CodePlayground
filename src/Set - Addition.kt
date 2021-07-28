//You are given two sets of strings in the input. Combine them and return the result.

fun main() {
    val first = setOf("Hello", "how")
    val second = setOf("Hello", "are", "you")

    print(solution(first,second).joinToString().replace(",", ""))
}
fun solution(first: Set<String>, second: Set<String>): Set<String> {
    return first + second
}

//output: Hello how are you