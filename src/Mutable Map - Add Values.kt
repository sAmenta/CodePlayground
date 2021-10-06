//Write a program that reads the names of students and their exam scores, adds them to MutableMap, and prints the result.
// In this MutableMap, names are keys, and scores are values.
// It is guaranteed that the keys are Strings and the values are of Int type.
// Keys and values must be read on a new line each.
// Input is over when the program receives the word "stop" instead of the next key.
// If the same key is entered more than one time, MutableMap must keep the value that was entered first.

fun main() {
    val studentsMarks = mutableMapOf<String, Int>()

    while (true) {
        val key = readLine()!!
        if (key == "stop") break

        val value = readLine()!!.toInt()
        if (! studentsMarks.containsKey(key)) studentsMarks[key] = value
    }

    println(studentsMarks)
}