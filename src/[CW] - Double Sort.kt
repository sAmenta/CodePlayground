/*
https://www.codewars.com/kata/57cc79ec484cf991c900018d/train/kotlin

Simple enough this one - you will be given an array. The values in the array will either be numbers or strings,
or a mix of both. You will not get an empty array, nor a sparse one.

Your job is to return a single array that has first the numbers sorted in ascending order,
followed by the strings sorted in alphabetic order. The values must maintain their original type.

Note that numbers written as strings are strings and must be sorted with the other strings.
 */

fun main() {
    val a = arrayOf<Any>("Apple",46,"287",574,"Peach","3","69",78,"Grape","423")
    val sortedArray = ::dbSort
    print(sortedArray(a).joinToString())
}

fun dbSort(a:Array<Any>):Array<Any> {
    val numbers = a.filterIsInstance<Int>().sorted().toMutableList()
    val strings = a.filterIsInstance<String>().sorted().toMutableList()
    val combined = mutableListOf<Any>()

    combined.addAll(numbers)
    combined.addAll(strings)

    return combined.toTypedArray()
}

/*
alternative solutions

fun dbSort(a: Array<Any>): Array<Any> = (a.filterIsInstance<Int>().sortedBy { it } + a.filterIsInstance<String>().sorted()).toTypedArray()
 */