//You are given a List of integers.
//Iterate through the given List and print in a single line the elements that are divisible by 2.

fun main() {
    val numbers = listOf(8, 11, 13, 2)
    val result = solution(numbers)
    for (r in result) {
        print(r)
    }
}
fun solution(numbers: List<Int>): Array<Int> {
    var storeArray = emptyArray<Int>()
    for (number in numbers) {
        if (number % 2 == 0) storeArray += number
    }
    return storeArray
}