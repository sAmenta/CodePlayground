/*
https://www.codewars.com/kata/5848565e273af816fb000449/train/kotlin
1) Your message is a string containing space separated words.
2) You need to encrypt each word in the message using the following rules:
   - The first letter must be converted to its ASCII code.
   - The second letter must be switched with the last letter

Examples:
encryptThis "Hello" == "72olle"
encryptThis "good" == "103doo"
encryptThis "hello world" == "104olle 119drlo"

 */

fun main() {
    val text = readln()
    print(encryptThis(text))
}

fun encryptThis(text:String): String{
    return text.split(" ")
        .map { it[0].code }.joinToString(" ")
}