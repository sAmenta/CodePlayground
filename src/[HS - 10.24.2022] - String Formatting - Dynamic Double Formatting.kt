/*
https://hyperskill.org/learn/step/21446

The function doubleFormat(value: Double, width: Int, precision: Int) formats a string of the value number,
with the width equal to width and the number of decimal digits equal to precision.

Complete the code of the function.

Sample input provides the arguments passed to the doubleFormat() function.
 */

fun main() {
    print(doubleFormat(672.457, 7 , 1))
}

fun doubleFormat(value: Double, width: Int, precision: Int): String {
    return "%$width.${precision}f".format(value)
}