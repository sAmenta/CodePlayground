fun main() {
    val intArray = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    for (i in 0 until intArray.size - 1) {
        if (intArray[i] > intArray[i + 1]) {
            println("NO")
            return
        }
    }
    println("YES")
}