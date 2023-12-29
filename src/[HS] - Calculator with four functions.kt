/*
https://hyperskill.org/repeat/step/12673
In the template below you have simple calculator functions that can subtract, add, divide, and multiply two numbers.
Now, we've decided to upgrade it to perform more complex tasks, such as logarithmic functions.
For that, separate functions are a better solution. Let's start by decomposing what we have.

Take a look at the template and decompose calculator operations into four functions:
subtractTwoNumbers(a: Long, b: Long) for subtraction, sumTwoNumbers(a: Long, b: Long) for addition,
divideTwoNumbers(a: Long, b: Long) for integer division and
multiplyTwoNumbers(a: Long, b: Long) for multiplication. Each function should print the calculation result.

Note that you can't divide by zero. In case your second argument is zero in the corresponding function,
print the message "Division by 0!".
 */

fun main() {
    val a = readln().toLong()
    val b = readln().toLong()

    println(subtractTwoNumbers(a, b))
    println(sumTwoNumbers(a, b))
    println(divideTwoNumbers(a, b))
    println(multiplyTwoNumbers(a, b))
}

fun subtractTwoNumbers(a: Long, b: Long) = a - b


fun sumTwoNumbers(a: Long, b: Long) = a + b


fun divideTwoNumbers(a: Long, b: Long) {
    try {
        a / b
    } catch (e: java.lang.ArithmeticException ) {
        println("Division by 0!")
    }
}

fun multiplyTwoNumbers(a: Long, b: Long) = a * b