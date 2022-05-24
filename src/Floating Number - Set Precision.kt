/*
Problem Statement
Bob has a floating point number N. He wants to set the precision for 2 digits after the decimal point for the number.
He is not good at coding, hence looking for your help.

Input
The first line contains T, the number of test cases. Next T line contains floating point number N.

Output
Print N in a separate line after setting precision for 2 digits after the decimal point:

Constraints
1 <= T <= 1000 1 <= N <= 10000

Sample Input
1
713.166

Sample Output

713.17
 */

import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var num: Float
    val df = DecimalFormat("#.##")
    
    repeat(readLine()!!.toInt()) {
        num = scanner.nextFloat()
        df.roundingMode = RoundingMode.CEILING
        println(df.format(num))
    }
}
