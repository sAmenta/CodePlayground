//You are given three Strings as input. Create a Map using these strings.
// Use the String as the key, and its length as the value. Return the resulting Map.

fun main() {
    val first = "I"
    val second = "love"
    val third = "Kotlin"

    print(stringToMap(first,second,third))
}

fun stringToMap(first: String, second: String, third: String): Map<String, Int> {
    return mapOf(first to first.length, second to second.length, third to third.length)
}

//Output: {I=1, love=4, Kotlin=6}