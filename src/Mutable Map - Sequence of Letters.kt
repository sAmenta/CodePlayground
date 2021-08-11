//There is a program that reads an unbounded sequence of letters from input each in a new line.
// It stops reading when letter z occurs in the sequence.
// Print the fourth letter in the sequence. If z letter occurs earlier than the fourth letter, the program must print null.

fun main() {
    val letters = mutableMapOf<Int,String>()
    var key = 1

    do {
        letters[key] = readLine()!!
        key++
    } while (!letters.containsValue("z"))

    for (i in 1 until 4) {
        if (letters[i] == "z") {
            print("null")
            break
        } else {
            print(letters[4])
            break
        }
    }
}