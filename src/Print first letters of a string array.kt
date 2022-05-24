// Give an array of strings, print the first letter of each elements in the same line and without spaces between letters

fun main() {
    val arr = arrayOf("James", "Amy", "Sam", "Olie", "Bob")
    var res = ""
    arr.forEach() {
            str -> res += str.first()
    }
    println(res)
}