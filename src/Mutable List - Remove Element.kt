//You are given a MutableList of strings and an Integer in the input.
// Remove an element at the index of the specified integer.

fun main() {
    val elements = readLine()!!.split(' ').toMutableList()
    val index = readLine()!!.toInt()

    val sequence = removeElement(elements, index)
    var result = ""

    for (l in sequence) {
        result += "$l "
    }

    print(result)
}

fun removeElement (elements: MutableList<String>, index: Int): MutableList<String> {
    elements.removeAt(index)
    return elements
}