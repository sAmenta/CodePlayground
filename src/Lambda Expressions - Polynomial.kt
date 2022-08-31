/*
Write a lambda expression that calculates a * x^2 + b * x + c
, where a, b, c are variables and x is the lambda parameter. The lambda is to have the (Int) -> Int type.
Note that variables a, b, c are already declared.
 */

fun main() {
    val a = 2
    val b = 6
    val c = 13

    val lambda: (Int) -> Int = { x: Int -> a * (x * x) + b * x + c }

    print(lambda(7))
}