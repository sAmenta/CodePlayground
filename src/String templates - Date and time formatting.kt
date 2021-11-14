/*You need to write a program that prints date and time in a special format.
Hours, minutes and seconds are split by a colon, and day, month and year are split by a slash.
 */

fun main() {
    val (h, min, s) = readLine()!!.split(" ")
    val (d, m, y) = readLine()!!.split(" ")
    println("$h:$min:$s $d/$m/$y")
}