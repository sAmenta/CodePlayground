/*
Write a program that takes a binary number from the user and convert it to decimal.
 */


fun main() {
    println()
    println("Input a binary number to convert it to decimal. For example, the decimal number of the binary 1001111 is 79.")
    var binaryNum = readLine()!!
    var decimalNum = binaryToDecimal(binaryNum)
    if (decimalNum == "invalid") {
        println("The binary you provided is invalid. Make sure it does not contains spaces, symbols or numbers that are not 0 or 1")
        binaryNum = readLine()!!
        decimalNum = binaryToDecimal(binaryNum)
        print(decimalNum)
    } else print(decimalNum)
}

fun binaryToDecimal(binaryNum : String): String {
    var sum = 0
    var powerOfTwo = 1
    for (index in binaryNum.lastIndex downTo 0) {
        if (binaryNum[index] == '0' || binaryNum[index] == '1') {
            sum += binaryNum[index].toString().toInt() * powerOfTwo
            powerOfTwo *= 2
        } else {
            return "invalid"
        }
    }
    return sum.toString()
}