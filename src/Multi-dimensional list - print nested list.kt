/*Write code that prints the third row of inputList in one string. The elements should be separated by a comma.
*/

fun main() {
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    print(inputList[2].joinToString(", "))
}