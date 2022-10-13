/*
You need to decode a string:

If the string's first symbol is i, remove the first symbol. The string will contain a number. Add 1 to the number and print it.
If the string's first symbol is s, remove the first symbol. Then print the reversed remainder.
If otherwise, print the unchanged string.
Here are string functions that you can use:

.first() returns the first symbol of the string.
.isEmpty() returns true, if the string has no symbols, otherwise, it returns false.
.drop(n) removes n first symbols from the string and returns the resulting string.
.reversed() returns the reversed string.
.toInt() converts the string to an integer and returns it.
You should output results using the println function.
 */

fun main() {
    val input = readLine()!!

    if (input.isNotEmpty()) {
        when (input.first()) {
            'i' -> println(input.drop(1).toInt() + 1)
            's' -> println(input.drop(1).reversed())
            else -> println(input)
        }
    } else println(input)
}