//Write a program that reads a list of integers and two numbers: p and m.
// The program is to check that p and m never occur next to each other (in any order) in the list.
//
//Input data format
//
//The first line contains the size of a list, N.
//The next N lines contain the elements of the list.
//The last line contains two integer numbers p and m separated by space.
//
//Output data format
//
//The result is a single value, that is, "YES" if p and m never occur next to each other, or "NO" if otherwise.

fun main() {
    val sequence = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val occurrence = readLine()!!.split(" ").toMutableList()
    var listOfNumbers = ""

    for (number in sequence) {
        listOfNumbers += "$number "
    }
    when {
        "${occurrence[0]} ${occurrence[1]}" in listOfNumbers -> print("NO")
        "${occurrence[1]} ${occurrence[0]}" in listOfNumbers -> print("NO")
        else -> print("YES")
    }
}