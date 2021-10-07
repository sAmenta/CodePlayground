//Write a function removing that takes MutableMap<Int, String> and value as the input and removes the element with such a key from the map.
// Print the resulting MutableMap.

fun main() {
    val currentMap = mutableMapOf(0 to "Sun", 3 to "Earth", 1 to "Mercury")
    val value = readLine()!!

    val removeKey = removing(currentMap, value)

    print(removeKey)
}

fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    val newMap = mutableMapOf<Int, String>()
    newMap.putAll(currentMap)
    currentMap.forEach { (t, u) -> if (u == value) newMap.remove(t) }
    return newMap
}