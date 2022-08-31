/*
You are given Map<String, Int> as input. Iterate through the map and print Fizz if the value is divisible by three without any remainder;
print Buzz if the value is divisible by five without any remainder; in all other cases print FizzBuzz.
 */

fun main() {
    val mapOfInts = mapOf("Int 1" to 2, "Int 2" to 6, "Int 3" to 4, "Int 4" to 15)
    iterator(mapOfInts)
}

fun iterator(map: Map<String, Int>) {
    map.forEach { (_, u) ->
        when {
            u % 5 == 0 -> println("Buzz")
            u % 3 == 0 -> println("Fizz")
            else -> println("FizzBuzz")
        }
    }
}

/*
alternative solution:

fun iterator(map: Map<String, Int>) =
    map.values.forEach {
        println(
            when {
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> "FizzBuzz"
            }
            )
    }
 */