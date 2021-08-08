//Write a program that uses the if expression to find the max of three integer numbers.
// These numbers can be positive, negative or zero.

fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(if (a > c) {
        if (a > b) a else b
    } else if (c > b) c else b)
}