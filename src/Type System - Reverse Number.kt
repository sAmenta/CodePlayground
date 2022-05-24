/*
Write a function named reverse that reverses a given Int value. If the given Int is null, then return -1.

 */

fun main() {
    val number = readLine()!!.toInt()
    print(reverse(number))
}

fun reverse(input: Int?): Int {
    var reversedNumber = ""
    return if (input == null) {
        -1
    } else {
        val sequence = input.toString()
        for (i in sequence.length - 1 downTo 0) {
            reversedNumber += sequence[i]
        }
        reversedNumber.toInt()
    }
}