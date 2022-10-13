/*
https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/kotlin
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
 */

fun main() {
    val text = readLine()!!
    print(capitalize(text))
}

fun capitalize(text: String): List<String> {
    var newText1 = ""
    var newText2 = ""

    for (i in text.indices) {
        newText1 += if (i % 2 == 0) text[i].uppercaseChar() else text[i]
        newText2 += if (i % 2 != 0) text[i].uppercaseChar() else text[i]
    }
    return listOf(newText1, newText2)
}

/*
alternative solutions

fun capitalize(text: String): List<String> =
    listOf(
        text.mapIndexed { index, c -> if (index % 2 == 0) c.toUpperCase() else c }.joinToString(""),
        text.mapIndexed { index, c -> if (index % 2 == 1) c.toUpperCase() else c }.joinToString("")
    )
 */