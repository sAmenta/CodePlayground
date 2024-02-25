/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"


 */

fun main() {
    val str = readln()
    print(toCamelCase(str))
}

fun toCamelCase(str:String):String {
    val delimiter1 = '-'
    val delimiter2 = '_'
    val splitStrings = str.split(delimiter1, delimiter2)
    var combinedString = splitStrings[0]

    for (i in 1 until splitStrings.size) {
        combinedString += splitStrings[i][0].uppercaseChar() + splitStrings[i].substring(1)
    }
    return combinedString
}

/*
Alternative solution:

fun toCamelCase(str: String) =
    str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
 */