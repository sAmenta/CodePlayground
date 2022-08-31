/*
Iterate through every second element of a list in a loop and find the index of the first word that starts with T.

It is guaranteed that at least one word with an odd index starts with T.
 */

fun main() {
    val wordList = listOf("Test", "Kora", "Terra", "Tetto", "Garry")
    print(solution(wordList))
}

fun solution(names: List<String>): Int {
    for (i in 1 until names.size step 2) {
        if (names[i].first() == 'T') {
            return i
        }
    }
    return 0
}