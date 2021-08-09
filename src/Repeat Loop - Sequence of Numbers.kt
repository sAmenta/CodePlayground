//You have a sequence of natural numbers that do not exceed 30000. Find the maximum element in the sequence divisible by 4.
// As input, the program first gets the number of elements in the sequence, and then the elements themselves.
// A sequence always has an element divisible by 4.
// The number of elements does not exceed 1000. The program should print a single number — the maximum sequence element (number) divisible by 4.

fun main() {
    var input: Int
    var max = 0

    repeat(readLine()!!.toInt()) {
        input = readLine()!!.toInt()

        if (input % 4 == 0 && input > max) {
            max = input
        }
    }
    print(max)
}