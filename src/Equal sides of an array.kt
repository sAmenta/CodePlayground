/*
You are going to be given an array of integers.
Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum
of the integers to the right of N. If there is no index that would make this happen, return -1.

For example:

Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index ({1,2,3})
and the sum of the right side of the index ({3,2,1}) both equal 6.

Let's look at another one.
You are given the array {1,100,50,-51,1,1}:
Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index ({1})
and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

Last one:
You are given the array {20,10,-80,10,10,15,35}
At index 0 the left side is {}
The right side is {10,-80,10,10,15,35}
They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
Index 0 is the place where the left side and right side are equal.

Output:
The lowest index N where the side to the left of N is equal to the side to the right of N.
If you do not find an index that fits these rules, then you will return -1.

Note:
If you are given an array with multiple answers, return the lowest correct index.
 */

fun main() {
    val sequence = intArrayOf(20,10,-80,10,10,15,35)
    val result = findEvenIndex(sequence)
    print(result)
}

fun findEvenIndex(arr: IntArray):Int {
    var tempRightSum = 0
    var rightSum = 0
    var leftSum = 0
    var n = 0

    loop@ for (index in arr.indices) {
        if (index == 0) {
            for (i in 1 until arr.size) {
                rightSum += arr[i]
            }
            if (rightSum == 0) {
                n = index
                break@loop
            }
        }
        else if (index > 0) {
            rightSum = 0
            for (i in index until arr.size) {
                try {
                    rightSum += arr[i + 1]
                    tempRightSum = rightSum
                } catch (e: ArrayIndexOutOfBoundsException) {
                    rightSum = tempRightSum
                }
            }
            for (i in 0 until index) {
                leftSum += arr[i]
            }
            if (rightSum == leftSum) {
                n = index
                break@loop
            } else {
                n = -1
                rightSum = 0
                leftSum = 0
            }
        }
    }
    return n
}