/*Create a 2x3 matrix (a 2-dimensional list) where each element consists of two numbers that correspond to its indices. So, the elements of this list are strings denoting the indices of each element.

For example, the second element in the first row should be a string "[0][1]".*/

fun main() {
    val matrix = mutableListOf(
        mutableListOf("[0][0]", "[0][1]", "[0][2]"),
        mutableListOf("[1][0]", "[1][1]", "[1][2]")
    )

    println(matrix)
}