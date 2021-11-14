/*You need to help the guard who is watching the main gate leading to the wilderness beyond the Wall.
It is his responsibility to put everyone who gets through the gate on the checklist backFromTheWall.

Add the name of the watchman (stored in the returnedWatchman variable) to the list backFromTheWall
and print the result with joinToString().*/

fun main() {
    val backFromTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    backFromTheWall.add(returnedWatchman)

    print(backFromTheWall.joinToString())
}