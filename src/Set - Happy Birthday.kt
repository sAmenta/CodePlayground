/*
Your friends made presents for your birthday, but they just numbered them without signing their names.
The most desirable presents are from Alice and Victor, so you want to know which gifts are from them.
Write a function findByIndex(names: Set<String>): String and return the numbers of Alice's and Victor's presents separated by a comma.
 */

fun main() {
    val guests = findByIndex(setOf("Ciccio", "Mark", "Alice", "Victor", "Mary"))

    print(guests)
}

fun findByIndex(names: Set<String>) = "${names.indexOf("Alice")}, ${names.indexOf("Victor")}"