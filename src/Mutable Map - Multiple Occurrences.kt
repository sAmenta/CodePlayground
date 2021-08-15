//There is a program that reads an unbounded sequence of words from the input.
// It stops reading when the next word that appears in the input is stop.
// Print the word that occurs most frequently in the input. If some words appeared equally frequently,
// then print the first one. If stop is the first word then print null.
//
//P.S. don't count stop word.

fun main() {
    val wordList = mutableListOf<String>()
    val words = mutableMapOf<String, Int>()
    var wordInput = readLine()!!
    var valueCounter = 0
    var mostOccurredWord = ""

    if (wordInput == "stop") {
        println("null")
    } else {
        while (wordInput != "stop") {
            wordList.add(wordInput)
            wordInput = readLine()!!
        }
        for (v in wordList) {
            var count = words[v]
            if (count == null) count = 0
            words[v] = count + 1
        }
        for ((key, value) in words) {
            if (valueCounter < value) {
                valueCounter = value
                mostOccurredWord = key
            }
        }
    }
    println(mostOccurredWord)
}