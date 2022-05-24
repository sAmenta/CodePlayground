/*
Write a program that reads a string and output true only when the letters of this string form a substring of the ordered English alphabet,
for example, "abc", "xy", "pqrst".

Otherwise, it should print out false.

Note: string can consist of a single character. Assume an empty string as an alphabet substring.

Sample Input 1:

abc
Sample Output 1:

true
Sample Input 2:

bce
Sample Output 2:

false
 */

fun main() {
    val pieceOfAlphabet = readLine()!!
    var result = false

    if (pieceOfAlphabet.length > 1) {
        for (i in 0 until pieceOfAlphabet.length - 1) {
            result = pieceOfAlphabet[i + 1] == pieceOfAlphabet[i] + 1
            if (!result) break
        }
    } else result = true

    print(result)
}