/*Imagine you implement a web service to pay for video games. There is a text field where a user inputs their card number.
A card number is a string like "AAAA AAAA AAAA AAAA", where A is any digit.
Please note that a correct card number contains three spaces as in the template.
Complete the function that receives a card number as a string and returns the card number as a Long
or produces any exception when the card number is incorrect.
 */

fun main() {
    val cardNumber = readLine()!!
    print(parseCardNumber(cardNumber))
}

fun parseCardNumber(cardNumber: String): Long {
    when {
        cardNumber.length != 19 -> throw Exception("The number of digits is incorrect")
        cardNumber[4] != ' ' && cardNumber[9] != ' ' && cardNumber[14] != ' ' -> throw Exception("Please check the spaces!")
    }
    for (i in cardNumber.indices) {
        when {
            cardNumber[i] !in "0123456789" && cardNumber[i] == ' ' && (i == 4 || i == 9 || i == 14) -> continue
            cardNumber[i] !in "0123456789" -> throw Exception("The card contains a letter or special char or space!")
        }
    }
    val cardNumberFixed = cardNumber.split(' ').toTypedArray()
    return (cardNumberFixed[0] + cardNumberFixed[1] + cardNumberFixed[2] + cardNumberFixed[3]).toLong()
}