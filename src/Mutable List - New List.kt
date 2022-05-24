/*
You are given a List of integers and an Integer in the input. Add the given Integer to the List and return the result.
 */

fun main() {
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toList()
    val number = readLine()!!.toInt()

    print(solution(numbers, number).joinToString(" "))
}

fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val newList = numbers.toMutableList()
    newList.add(number)
    return newList
}