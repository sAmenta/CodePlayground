/*
Write an implementation of a function named isNumber that determines if String can be converted to Int .
If it can, then return its Int value, otherwise return the same String.
 */

fun main() {
    val sequence = readLine()!!
    print(isNumber(sequence))
}

fun isNumber(input: String): Any {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        input
    }
}