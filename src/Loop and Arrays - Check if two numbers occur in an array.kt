//Write a program that reads an unsorted array of integers and two numbers: P and M. The program needs to check whether P and M occur in the array.
//
//The first line contains the size of an array.
//The next N lines contain elements of the array.
//The last line contains two integer numbers P and M, separated by one space character.
//
//If both numbers occur in the array you need to print YES, otherwise NO.

fun main() {
    val arraySize = readLine()!!.toInt()
    val p = IntArray(arraySize)

    for (i in 0 until arraySize) {
        p[i] = readLine()!!.toInt()
    }

    val m = readLine()!!.split(" ").toTypedArray()

    if (m[0].toInt() in p && m[1].toInt() in p) print("YES") else print("NO")
}