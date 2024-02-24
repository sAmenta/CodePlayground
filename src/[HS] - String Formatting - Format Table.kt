/*
https://hyperskill.org/repeat/step/21447
String formatting is most useful when we need to create a table (e.g., a table of numbers).
The program reads 4 Double numbers and prints a table. Each number in the table occupies 12 characters,
is right-justified, has a thousands separator, and keeps 2 decimal places.

Complete the missing code.

Sample Input 1:

8.118
967.2
4234.234
0.3456

Sample Output 1:

        8.12      967.20
    4,234.23        0.35
 */

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val d = readln().toDouble()

    val table = String.format("%,12.2f %,12.2f\n%,12.2f %,12.2f", a, b, c, d)
    print(table)
}