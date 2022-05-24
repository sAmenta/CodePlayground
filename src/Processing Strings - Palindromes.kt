/*
Write a program that reads a string and checks whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left.

The program must output “yes” if the string is a palindrome and “no” otherwise.
 */

fun main() {
    val word = readLine()!!
    print(if (word.reversed() == word) "Yes" else "No")
}