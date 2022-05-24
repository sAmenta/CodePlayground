/*
Write a program that reads an unsorted list of integers and two numbers: P and M. The program needs to check whether P and M occur in the list.

The first line contains the size of the list.
The next N lines contain the elements of the list.
The last line contains two integer numbers P and M separated by a space.

If both numbers occur in the list you need to print YES, otherwise – NO.
 */

fun main() {
    val listSize = readLine()!!.toInt()
    val sequence = List(listSize) { readLine()!!.toInt() }
    val input = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    if (input[0] in sequence && input[1] in sequence) print("YES") else print("NO")
}