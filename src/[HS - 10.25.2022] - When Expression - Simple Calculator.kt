/*
https://hyperskill.org/learn/daily/4605

Write a simple calculator that reads three values from the line: the first number, the operator and the second number.

The program should apply the operation to the numbers and output the result. Note that the numbers are long.

The calculator must support:

addition: +
subtraction: -
integer division: /
multiplication: *
If a user performs the division and the second number is 0, output Division by 0!

If the input operator is not in the list, output Unknown operator.
*/

fun main() {
    val (firstNumber, operator, secondNumber) = readLine()!!.split(' ')

    val result = when (operator) {
        "+" -> firstNumber.toLong() + secondNumber.toLong()
        "-" -> firstNumber.toLong() - secondNumber.toLong()
        "*" -> firstNumber.toLong() * secondNumber.toLong()
        "/" -> if (secondNumber == "0") "Division by 0!" else firstNumber.toLong() / secondNumber.toLong()
        else -> "Unknown operator"
    }
    print(result)
}