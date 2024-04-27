import java.util.*

/*
Write a program in Kotlin that takes a floating point number as input.
The program should then round off that number to two decimal places.
If the input is not a floating point number, it should output an error message.
 */


fun main() {
    val read = Scanner(System.`in`)

    try {
        val userInput = read.next().toFloat()
        val roundedNumber = String.format("%.2f", userInput)
        print(roundedNumber)
    } catch (e: NumberFormatException){
        println("Input is not a floating-point number")
    }
}