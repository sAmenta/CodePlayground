/*
Write a program that checks if a set of N numbers contains a number M.

The first line contains the N number.
The next N lines contain the numbers.
The last line contains one integer number M.

You need to output either YES or NO.

 */

fun main() {
    val n = readLine()!!.toInt()
    val sequence = mutableListOf<Int>()

    for (i in 0 until n) {
        sequence.add(readLine()!!.toInt())
    }

    if (readLine()!!.toInt() in sequence) print("YES") else print("NO")
}