/*
https://hyperskill.org/learn/daily/9041

Write a program that reads a string, and then outputs the string without its middle character when the length is odd,
and without the middle 2 characters when the length is even.

Examples:

Input: Hello
Output: Helo

Input: abcd
Output: ad
 */

fun main() {
    val string = readLine()!!

    if (string.length % 2 != 0) {
        print(string.substring(0, string.length / 2) + string.substring(string.length / 2 + 1))
    } else print(string.substring(0, string.length / 2 - 1) + string.substring(string.length / 2 + 1))
}