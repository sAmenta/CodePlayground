/*
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.
 */

fun main() {
    val str = readln()
    print(removeChar(str))
}
fun removeChar(str: String): String = str.substring(1, str.length - 1)