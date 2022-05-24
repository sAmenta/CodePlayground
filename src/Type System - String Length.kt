/*
Write an implementation of a function named getLength that returns the length of a String, or -1 if the string is null.

 */
fun main() {
    val stringValue = readLine()!!
    print(getLength(stringValue))
}

fun getLength(input: String?): Int {
    return input?.length ?: -1
}