/*
Write a program that capitalizes all letters after the last u symbol in a word and prints the resulting string.
 */

fun main() {
    val string = readln()
    print("${string.substringBeforeLast('u')}u${string.substringAfterLast("u").uppercase()}")
}