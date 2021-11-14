/*The Lord Commander of the Night’s Watch wants to know if anyone is patrolling beyond the Wall.
He has two checklists from the guards: beyondTheWall lists all who went beyond the Wall,
and backFromTheWall contains the names of all those who returned. Both checklists are already initialized as lists.

Help the Lord Commander to check whether anyone is currently on patrol.
If there is no one beyond the Wall, print true; otherwise, print false.*/

fun main() {
    val beyondTheWall = readLine()!!.split(", ").toMutableList()
    val backFromTheWall = readLine()!!.split(", ").toMutableList()

    print(beyondTheWall == backFromTheWall)
}