/*
Write a program that reads a number and prints the tens in that number. Use indexes to solve this problem!
 */

fun main() {
    val input = readLine()!!

    print(input[input.lastIndex - 1])
}