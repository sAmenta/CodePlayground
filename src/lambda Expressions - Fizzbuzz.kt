/*
FizzBuzz is a children's game to learn division. You are given a range of numbers, and you are to count incrementally.
Although, when a number is divisible by 3, you should say "fizz", and when a number is divisible by 5, you should say "buzz".
When both conditions are true for a number, you should say "fizzbuzz".
 */

fun fizzbuzz(from: Int, to: Int, transformation: (Int) -> String) {
    for (number in from..to) {
        println(transformation(number))
    }
}

fun main() {
    fizzbuzz(1, 100) { number ->
        if (number % 15 == 0) {
            return@fizzbuzz "fizzbuzz"
        }
        if (number % 3 == 0) {
            return@fizzbuzz "fizz"
        }
        if (number % 5 == 0) {
            return@fizzbuzz "buzz"
        }
        return@fizzbuzz number.toString()
    }
}