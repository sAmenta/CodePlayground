/*
Given the number N with an even number of digits.
If the sum of the first half of the digits equals the sum of the second half of the digits,
then this number is considered lucky. For a given number, output "YES" if this number is lucky, otherwise output "NO".
 */

fun main() {
    val sequence = readLine()!!
    val firstHalf = mutableListOf<Int>()
    val secondHalf = mutableListOf<Int>()

    for (i in sequence.substring(0, sequence.length / 2)) {
        firstHalf.add(i.toString().toInt())
    }

    for (i in sequence.substring(sequence.length / 2, sequence.length)) {
        secondHalf.add(i.toString().toInt())
    }

    if (firstHalf.sum() == secondHalf.sum()) print("YES") else print("NO")
}