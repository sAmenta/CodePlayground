/* You have a mutable list of integers numbers. Add the sum of all list elements to the beginning of the list.
Then delete the penultimate item in the list. It is guaranteed that the length of the array is greater than 2.
 */

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    numbers.add(0, numbers.sum())
    numbers.removeAt(numbers.lastIndex - 1)
    println(numbers.joinToString(" "))
}