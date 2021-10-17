/* Write a program that reads a list of integers and finds the index of the first maximum in the list.

The first line contains the number of elements in the list. The other lines contain the elements of the list.
There is at least one element in the list.

Output a single integer value, which is the index of the first maximum.*/

fun main() {
    val sequence = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    var maxNumber = 0

    for (i in 0..sequence.lastIndex) {
        if (sequence[i] > maxNumber) maxNumber = sequence[i]
    }
    print(sequence.indexOf(maxNumber))
}