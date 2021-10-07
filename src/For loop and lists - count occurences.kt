//Write a program that counts the times a number M occurs in N numbers.
//
//The first line contains the N number.
//The next N lines contain the numbers.
//The last line contains the M number.
//
//Output only a single non-negative integer number.

fun main() {
    val sequence = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    var counter = 0
    sequence.forEach { element -> if (element == m) counter++ }
    print(counter)
}