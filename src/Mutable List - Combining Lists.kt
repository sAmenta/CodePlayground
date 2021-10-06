//You are given two lists of integers. Combine these lists and return the result.

fun main() {
    val first = readLine()!!.split(' ').map { it.toInt() }.toList()
    val second = readLine()!!.split(' ').map { it.toInt() }.toList()

    val sequence = newSolution(first, second)
    var result = ""

    for (n in sequence) {
        result += "$n "
    }

    print(result)
}

fun newSolution(first: List<Int>, second: List<Int>): MutableList<Int> {
    return (first + second).toMutableList()
}