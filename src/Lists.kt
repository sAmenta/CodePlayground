/*fun consoleList(console: List<String>) {
    val labels = listOf("This is a wonderful", "Oh. yeah! This is a", "I found a", "Look at this! It's a")
    console.forEach { item ->
        println("${labels.random()} $item")
    }
}

fun main() {
    val consoles = listOf("XBOX", "PS5", "Switch")

    consoleList(consoles)

    val consoles2 = mutableListOf("GameCube", "Game Gear")
    consoles2.add("Saturn")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val map2 = mutableMapOf(4 to "d")
    map2.put(5,"e")
}*/

fun main() {
    var emptyArray = emptyArray<Int>()
    var counter = 0
    val mutMap = mutableMapOf(1 to 2)
    val mutList = mutableListOf("Ciccio")
    for (i in 0..8) {
        emptyArray += counter++
    }
    print(emptyArray.contentDeepToString())
    println()
    println(emptyArray.size)
    emptyArray[0] = 2
    println(emptyArray.contentDeepToString())
    emptyArray += 10
    println(emptyArray.contentDeepToString())
}