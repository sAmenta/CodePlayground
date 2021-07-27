//You are given a List of strings and a String in the input.
//
//Calculate the number of occurrences of the String in the List.
fun main() {
    val strings = listOf("Marco", "Paolo", "Alfredo", "Paolo")
    val str = readLine()!!
    print(solution(strings, str))
}
fun solution(strings: List<String>, str: String): Int {
    return strings.count { it == str }
}