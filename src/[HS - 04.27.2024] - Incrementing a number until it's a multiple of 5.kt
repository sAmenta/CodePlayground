import java.util.*

/*
Create a program in Kotlin that reads an integer number from the standard input, declares it as a mutable variable,
increments the variable until it becomes a multiple of 5, and then print the final variable value.
Your program should stop incrementing the variable as soon as it becomes a multiple of 5
 */

const val FIVE = 5
fun main() {
    // Create a scanner object for reading inputs
    val reader = Scanner(System.`in`)
    var input = reader.next().toInt()

    while (input % FIVE != 0) {
        input += 1
    }

    print(input)
}