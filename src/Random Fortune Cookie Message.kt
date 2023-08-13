import java.util.*

var birthday = ""
fun main() {
    println("Enter your birthday:")
    birthday = readln()
}

fun getFortuneCookies() {
    val messages = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
}

fun birthdayFormat() : Int {
    val birthdayRegex = Regex("([1-2]?[0-9]|3[0-1])\\/([1-9]|10|11|12)\\/\\d{4}")
    if (birthday.matches(birthdayRegex)) {
        return birthday.split("/").toTypedArray()[0].toInt() % 7
    } else return 1

}