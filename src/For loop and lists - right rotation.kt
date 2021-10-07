/*Right rotation is an operation that shifts each element of the list to the right.

If we right rotate the list {1,2,3,4,5} by 1 position, the new list will be {5,1,2,3,4}.
Another example: if we right rotate the list {1,2,3,4,5} by 2 positions, the new list will be {4,5,1,2,3} because
{1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

The first line of the input contains the number of elements in the list, N.
The next N lines contain the elements of the list.
The last line is a value that indicates the number of positions to rotate.

The output contains the shifted elements of the list. Separate the elements by a space.*/


fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!! }
    val rot = readLine()!!.toInt() % list.size
    repeat(rot) {
        list.add(0, list[list.size - 1])
        list.removeAt(list.size - 1)
    }
    println(list.joinToString(" "))
}