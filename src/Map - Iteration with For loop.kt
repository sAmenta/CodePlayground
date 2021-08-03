//You are given Map<Int, Int> as input. Return the sum of all values that have even keys.

fun main() {
    val map = mapOf(100 to 10, 55 to 3, 112 to 5)
    print(summator(map))
}
fun summator(map: Map<Int, Int>): Int {
    var sum = 0
    for (i in map) if (i.key % 2 == 0) sum += i.value
    return sum
}

//output: 15
