/*The function printFifthCharacter represented below returns the 5th character of the input string.
However, it does not allow the possibility to have less than 5 characters in the entered word.
In such cases, the StringIndexOutOfBoundsException will be thrown.

Write code in the printFifthCharacter function that in the case of such an exception will return the string The input word is too short!
and will not interrupt the execution of the program.

Use the try/catch statement.*/

fun main() {
    val input = readLine()!!
    print(printFifthCharacter(input))
}
fun printFifthCharacter(input: String): String {
    return try {
        "The fifth character of the entered word is ${input[4]}"
    } catch (e: StringIndexOutOfBoundsException) {
        "The input word is too short!"
    }
}