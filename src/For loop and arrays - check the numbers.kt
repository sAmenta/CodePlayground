/*
Write a program that reads an array of integers and two numbers p and m.
The program is to check that p and m never occur next to each other (in any order) in the array.

Input data format

The first line contains the size of an array, N.
The next N lines contain elements of the array.
The last line contains two integer numbers p and m., separated by the space character.

Output data format

The result is a single value, that is, "YES" if p and m never occur next to each other, otherwise, "NO".
 */

fun main() {
    val arraySize = readLine()!!.toInt()
    val sequence = IntArray(arraySize) { readLine()!!.toInt() }
    val input = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var result = " "

    try {
        for (i in sequence.indices) {
            if ((sequence[i] == input[0] && sequence[i + 1] == input[1]) || (sequence[i] == input[1] && sequence[i + 1] == input[0])) {
                result = "NO"
                break
            } else {
                result = "YES"
                continue
            }
        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        result = "YES"
    }
    print(result)
}