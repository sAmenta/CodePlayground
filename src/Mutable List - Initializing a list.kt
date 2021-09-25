//Create a mutable list of integers named numbers with 100 elements.
//Its first element must be 1, the tenth must be 10, and the hundredth one must be 100.
//All other elements must be equal to 0.

fun main() {
    val numbers = MutableList(100) { 0 }

    for (i in 0 until numbers.size) {
        when (i) {
            0 -> numbers[i] = 1
            9 -> numbers[i] = 10
            99 -> numbers[i] = 100
        }
    }
    println(numbers.joinToString())
}