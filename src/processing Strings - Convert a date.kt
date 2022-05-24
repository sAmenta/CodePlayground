/*
Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.

Sample Input 1:
2012-09-28

Sample Output 1:
09/28/2012
 */

fun main() {
    val (year, month, day) = readln().split("-")
    print(listOf(month, day, year).joinToString("/"))
}