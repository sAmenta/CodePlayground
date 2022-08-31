/*
The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

Task
Given a year, return the century it is in.

Examples
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20
 */

fun main() {
    print(century(645678))
}

fun century(number: Int) = if (number / 100f > number / 100) number / 100 + 1 else number / 100