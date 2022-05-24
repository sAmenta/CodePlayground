/*Here is a program that uses the check function according to this logic: if the length of the input string is greater than 5,
it returns null; otherwise it returns the string. It has to return 0 in null case.
 */

fun main() {
    val argument = readLine()!!
    println(check(argument)?.length ?: 0)
}

fun check(name: String): String? {
    return if (name.length > 5) null else name
}