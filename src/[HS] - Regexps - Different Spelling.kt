/*
https://hyperskill.org/learn/step/10727
Some words are spelled differently in American and British English.
Using special characters, create a regular expression color that fits four options: "color", "colour", "colors", and "colours".

Tip: Your task is to make a regex that suits the situation best. Don't try to write a universal pattern: use the characters . and ?.
 */

fun main() {
    val color = readln()
    val acceptedSpelling = Regex("colou?rs?")

    print(color.matches(acceptedSpelling))
}