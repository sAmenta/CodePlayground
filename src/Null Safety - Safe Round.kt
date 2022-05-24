/*Here is a program that uses the round function according to this logic: if the input number is greater than 1000,
it returns null, otherwise it returns the number. It has to return 0 in null case.
 */

fun main() {
    val number = readLine()!!.toInt()
    println(round(number) ?: 0)
}

fun round(number: Int): Int? {
    return if (number >= 1000) null else number
}