/*
https://hyperskill.org/learn/step/21445

This program should reads a Double number and print it with a thousands separator and exactly 2 decimal digits
(see the sample input and output). Correct the format string in order to achieve the described behavior.

Sample Input 1:
1264.86453

Sample Output 1:
1,264.86
 */

fun main() {
    val value = readln().toDouble()
    val doubleString = String.format("%,1.2f", value)

    println(doubleString)
}