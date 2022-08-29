/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */

fun main() {
    val numbers = listOf(34, -345, -1, 100)
    print(findSmallestInt(numbers))
}

fun findSmallestInt(nums: List<Int>) = nums.minOf { i: Int -> i }
