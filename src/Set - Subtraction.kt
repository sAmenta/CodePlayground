//You are given two sets of integers in the input.
// Subtract one from the other and return the size of the resulting set.
fun main() {
    val numbers1 = setOf(8, 11, 12, 13)
    val numbers2 = setOf(8, 12)

    print(solution(numbers1,numbers2))
}
fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    return (numbers1 - numbers2).size
}

//output: 2