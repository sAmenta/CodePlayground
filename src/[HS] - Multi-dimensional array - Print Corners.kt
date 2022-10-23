/*
https://hyperskill.org/learn/daily/10959

You already have a 2D array inputArray. Print all of its corners in the following order: left to right and top to bottom.

Print the result for two elements in the line. Use a single space to separate two elements on the same line.

Take a look at the examples below, and remember that nested arrays can be of different lengths!
 */

fun main() {
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    println("${inputArray[0].first()} ${inputArray[0].last()}")
    println("${inputArray[n - 1].first()} ${inputArray[n - 1].last()}")
}