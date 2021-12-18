/* Write a program that calculates the division of two input numbers.
It may throw an ArithmeticException. Fix it to avoid the exception.

In the case when the exception can happen, the corrected program should output:
Division by zero, please fix the second argument!.*/

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    if (number2 == 0) {
        print("Division by zero, please fix the second argument!")
    } else print(number1 / number2)
}