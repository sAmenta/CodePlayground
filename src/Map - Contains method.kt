//You are given Map<String, String> and String as input.
//Return true if Map contains String as a key and as a value; otherwise, return false.

fun main() {
    val map = mapOf("one" to "two", "three" to "one", "four" to "five")
    val value = "one"

    print(containsKeyAndValue(map, value))
}
fun containsKeyAndValue(map: Map<String, String>, value: String): Boolean {
    return if (map.containsValue(value) && map.containsKey(value)) true else false
}