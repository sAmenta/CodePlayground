/*
Implement a function generator.

It returns the function by the name given. Support three functions:

"identity" (returns its argument).
"half" (returns its argument divided by 2).
"zero" (returns 0).
If the name is unknown, return the "zero" function.
 */

fun identity()= readLine()!!.toInt()
fun half() = readLine()!!.toInt() / 2
fun zero() = 0

fun generate(functionName: String): () -> Int {
    return when (functionName) {
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}

fun main() {
    val funGen = generate(readLine()!!)
    print(funGen())
}
