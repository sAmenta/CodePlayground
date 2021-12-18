/*Imagine you have a 2D list inputList. Print all of its corner elements in the following order: left to right and top to bottom.

Print the result for two elements in one line. Use a single space to separate two elements on the same line.*/

fun main() {
    //Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    println("${inputList[0].first()} ${inputList[0].last()}")
    println("${inputList[n - 1].first()} ${inputList[n - 1].last()}")
}