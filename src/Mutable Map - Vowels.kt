//There is a program that reads a letter from the input.
// It must print the number of this letter in the alphabet only if it's a vowel.
// If the input letter is not a vowel, the program must print 0.
//
//Do not consider the letter 'y' as a vowel.

import java.util.*

fun main() {
    val vowels = mutableMapOf("a" to 1, "e" to 5, "i" to 9, "o" to 15, "u" to 21)
    val scanner = Scanner(System.`in`)
    val input = scanner.next().lowercase()

    print(if (input in vowels) vowels[input] else 0)
}