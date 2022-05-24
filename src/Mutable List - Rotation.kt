/*
You are given an array of N length. You have to rotate the array rightwards by K rotations, that is, shift each element to the right by K positions. Print the rotated array.

Input:
First line contains N and K.
Second line contains N integers denoting the array.

Output:
Print the array after the rotation.

Constraints:
1 <= N, K <= 100000
1 <= Arr[i] <= 10^9

Sample Input:
5 2
1 2 3 4 5

Sample Output:
4 5 1 2 3

 */

fun main() {
    val nk = readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val sequence = readLine()!!.split(" ").map { it.toInt() }.toMutableList()


    repeat(nk[1]) {
        sequence.add(0, sequence[sequence.size - 1])
        sequence.removeAt(sequence.size - 1)
    }

    print(sequence.joinToString().replace(",", ""))
}