/*
https://hyperskill.org/learn/daily/4702

Write a program that reads N numbers and outputs the length of the longest sequence in non-descending order.
By non-descending, we mean that the next element is either equal or greater than the previous one (A<=B).
Elements of the sequence are to follow one another.

Input format

The first line contains the positive integer number N (N>0).
The other lines contain N numbers.

Example

The input array is 1 2 4 1 2 2 5 7 4 3. In this case, the length of the longest sequence in non-descending order is 5.
It includes these elements: 1 2 2 5 7.
 */

fun main() {
    val sequence = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    print(sequence)
}