/*
https://hyperskill.org/learn/step/21448

The function printOctAndHex(value: Int) gets an Int number and prints this number
in its octal and hexadecimal format separated by a single space. The octal number should have a leading 0,
while the hexadecimal number should have a leading 0x.

Write the code of this function.

Sample Input 1:
7368
Sample Output 1:
016310 0x1cc8
 */

fun main() {
    printOctAndHex(7368)
}
fun printOctAndHex(value: Int) {
    print(String.format("%#o %#x", value, value))
}