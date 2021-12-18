/*Imagine you have a 2D list inputList. It is guaranteed that it has at least two nested lists.

Create a new two-dimensional list with two nested lists — the first and last lists of inputList — in reverse order.
In other words, the last one should become the first, and vice versa.
 */

fun main() {
    //Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    val newList : MutableList<MutableList<String>> = mutableListOf(
        inputList.last(),
        inputList.first()
    )
    print(newList)
}