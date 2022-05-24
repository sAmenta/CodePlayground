/*
You are given a Set of strings and a String as input. Remove the given string from the Set and return the result.
Sample Input 1:
Hello it's you me
you

Sample Output 1:
Hello it's me
 */

fun main() {
    val phrase = readLine()!!.split(" ").toSet()
    val word = readLine()!!

    print(solution(phrase, word).joinToString(" "))
}

fun solution(elements: Set<String>, element: String): MutableSet<String> {
    var newPhrase = mutableSetOf<String>()
    return if (element in elements) {
        newPhrase = elements.toMutableSet()
        newPhrase.remove(element)
        newPhrase
    } else newPhrase
}