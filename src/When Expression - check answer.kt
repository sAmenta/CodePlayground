/*
Write a program that finds out which programming language a student is learning. I hope you know the correct answer.

Which programming language are you learning?

Java
Kotlin
Scala
Python
The program is to read the numerical answer from the standard input and output the result: Yes!, No!, or Unknown number.

 */

fun main() {
    when (readLine()!!.toInt()) {
        1, 3, 4 -> print("No!")
        2 -> print("Yes!")
        else -> print("Unknown number")
    }
}