//You are given a MutableList of strings and a String in the input.
// Replace the occurrences of the given String in the MutableList with Banana.

fun main() {
    val strings = readLine()!!.split(" ").toMutableList()
    val str = readLine()!!
    val result = solution(strings, str)
    var sentence = ""
    for (word in result) {
        sentence += word + " "
    }
    print(sentence)
}

fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    for (string in strings) {
        if (string == str) {
            strings[strings.indexOf(string)] = "Banana"
        }
    }
    return strings
}