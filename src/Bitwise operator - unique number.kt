/*
Three numbers a, b, c are fed to the input of the program, two of them are the same

Output the number that has no pair, i.e. the only number that does not repeat
 */

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    if (a + b == a shl 1) print(c) else if (b + c == b shl 1) print(a) else print(b)
}