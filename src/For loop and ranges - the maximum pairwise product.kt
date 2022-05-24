/*
Write a program that reads N numbers and outputs the maximum pairwise product of the given N numbers
(the largest number that can be obtained by multiplying two different elements from the sequence).

If there is only one input element, output this element.

The first line of the input contains the number of elements N.
The following lines contain N numbers, each on a separate line. All the numbers are positive.
 */

fun main() {
    val size = readLine()!!.toInt()
    val sequence = List(size) { readLine()!!.toInt() }
    print(maxProduct(sequence))
}

fun maxProduct (sequence : List<Int>): Int {
    var product = 0
    return if (sequence.size > 1) {
        for (i in sequence) {
            for (j in sequence.indices) {
                if (product < i * sequence[j] && sequence.indexOf(i) != j) {
                    product = i * sequence[j]
                }
            }
        }
        product
    } else sequence[0]
}