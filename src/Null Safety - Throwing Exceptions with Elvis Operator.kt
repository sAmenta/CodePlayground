/*Try to read a line. If there is no line, throw an IllegalStateException(). If there is a line, output Elvis says: $line.

Use the ?: throw construction to solve this task.*/

fun main() {
    println("Elvis says: ${readLine() ?: throw IllegalStateException()}")
}