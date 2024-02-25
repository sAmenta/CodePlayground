/*
https://hyperskill.org/learn/step/10726
Using special characters, create a regex instance named regex that matches all the strings below:

"20 rings", "9 rings", "7 rings", "3 rings", "1 ring".

Tip: Your task is to make a regex that suits the situation best. Don't try to write a universal pattern: use the characters . and ?.

 */

fun main() {
    val input = readln()
    val regex = Regex("..? rings?")

    print(input.matches(regex))
}