//Anna has a home robot.
// She sent it to the store and provided with a list of purchases in the form of a Map with key as the name of the product
// and value as the number of items to be purchased.
// However, later Anna decided to send an additional list of purchases (another Map) to the robot.
//
//Write a function helpingTheRobot that combines the two purchase lists into one and returns it as the result.
// If both lists contain the same product, its quantity in the final MutableMap must be the total value from both lists.

fun main() {
    val purchases = mapOf("bread" to 1, "potatoes" to 7, "milk" to 2)
    val addition = mapOf("milk" to 1, "water" to 3)
    val functionCall = helpingTheRobot(purchases, addition)

    println(functionCall)
}

fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    val combinedMap = (purchases + addition).toMutableMap()
    for (k in addition.keys) {
        if (purchases.containsKey(k)) combinedMap[k] = addition.getValue(k) + purchases.getValue(k)
    }
    return combinedMap
}