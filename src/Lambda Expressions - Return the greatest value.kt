/*
Write a lambda expression that takes two integer arguments and returns the greatest of them.
 */

fun main() {
    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> maxOf(a, b) }
    print(lambda(5, 10))
}