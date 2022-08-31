/*
Suppose you have a predicate originalPredicate: (Char) -> Boolean and you want to have the opposite predicate.
Write a predicate notPredicate that takes a Char variable and returns the opposite of originalPredicate from that variable.
 */

fun main() {
    val originalPredicate: (Char) -> Boolean = { true }
    val notPredicate: (Char) -> Boolean = { c: Char -> !originalPredicate(c) }
    print(notPredicate('a'))
}