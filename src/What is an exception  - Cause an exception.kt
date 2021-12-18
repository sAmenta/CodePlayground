//Create any program that fails with an exception.

fun main() {
    val array = IntArray(5)
    for (i in 0..7) {
        array[i] = (1..100).random()
    }
    println(array.joinToString(" "))
}