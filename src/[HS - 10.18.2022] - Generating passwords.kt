/*
https://hyperskill.org/learn/daily/9044

The password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters,
at least C digits, and includes exactly N symbols.
Also, a password cannot contain two or more same characters coming one after another. For a given numbers A, B, C, N
you should output a password that matches these requirements.

It is guaranteed A, B, C, and N are non-negative integers and A + B + C <= N. Keep in mind,
that any parameter can be equal to zero. It means that it's ok if the password doesn't contain symbols of such type.

Sample Input 1:
3 4 1 8
Sample Output 1:
PaSsw0rD
 */

//import java.util.*

fun main() {
    //val scanner = Scanner(System.`in`)
    val uppercaseLetters = ('A'..'Z').random()
    print(uppercaseLetters)
}