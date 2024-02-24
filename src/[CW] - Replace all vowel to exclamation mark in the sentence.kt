/*
https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/kotlin
Replace all vowel to exclamation mark in the sentence.
aeiouAEIOU is vowel.

Examples
replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"
replace("aeiou") === "!!!!!"
replace("ABCDE") === "!BCD!"
 */

fun main() {
    val s = readln()
    print(replace(s))
}

fun replace(s: String) = s.map { if (it in "aeiouAEIOU") '!' else it}.joinToString("")
