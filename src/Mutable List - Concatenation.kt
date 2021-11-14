/*Concatenate two lists firstList and secondList and print the result.

In the example below, each line corresponds to a separate list. Elements are separated by spaces.*/

fun main() {
    val firstList = readLine()!!.split(' ').toMutableList()
    val secondList = readLine()!!.split(' ').toMutableList()

    print((firstList + secondList).joinToString(" "))
}