/*
Write a function intsToSet(ints: MutableList<Int>): Set<Int> that takes input and outputs a set of Int's from the input list.
 */

fun main() {
    val listOfInts = mutableListOf(1, 2, 3, 4, 5)
    intsToSet(listOfInts)
}

fun intsToSet(ints: MutableList<Int>) = ints.toSet()