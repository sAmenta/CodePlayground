/*
https://hyperskill.org/learn/daily/4608
There are coordinates of two queens on a chessboard. Find out, whether they take each other. Taking in chess means attacking.
The queen moves any number of vacant squares horizontally, vertically, or diagonally.

Input data format

Four integer numbers x1, y1, x2, y2

Output data format: Type "YES" (uppercase) if they take each other and "NO" if they don't.

Sample Input 1:

1 1
3 3
Sample Output 1:

YES
Sample Input 2:

1 1
4 3
Sample Output 2:

NO
Sample Input 3:

2 2
5 2
Sample Output 3:

YES
 */

import kotlin.math.abs
fun main() {
    val (x1, y1) = readLine()!!.split(' ').map{it.toInt()}
    val (x2, y2) = readLine()!!.split(' ').map{it.toInt()}

    when {
        x1 == x2 -> print("YES")
        y1 == y2 -> print("YES")
        abs(x1 - x2) == abs(y1 - y2) -> print("YES")
        else -> print("NO")
    }
}