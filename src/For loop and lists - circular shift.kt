/*Write a program that reads an A list of integers and cyclically shifts the elements of the list to the right:
A[0] goes to the place of A[1], A[1] becomes A[2], ..., and the last element goes to the place of A[0].
The first line of the input contains the number of elements in the list.
The other lines contain the elements of the list.
The output contains all the shifted elements of the list in a single line. Separate the elements by a space. */


fun main() {
    val sequence = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    sequence.add(0, sequence[sequence.size - 1])
    sequence.removeAt(sequence.size - 1)

    print(sequence.joinToString().replace(",", ""))
}