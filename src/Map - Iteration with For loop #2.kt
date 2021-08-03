/*In the store, all products are stored in a Map<String, Int>, which holds name - price pairs.
The customer comes with a shopping list and wants to know what the total price of products on the list will be.
Keep in mind that some products may not be available in the store.
You are given Map<String, Int> (product name and price) and Array of String (shopping list) as the function parameters.
Return the total price of the items the customer needs to buy.*/

fun main() {
    val priceList = mapOf("Cola" to 500, "Apple" to 1500, "Banana" to 300)
    val shoppingList = arrayOf("Cola", "Apple")

    print(bill(priceList, shoppingList))
}

fun bill(priceList: Map<String, Int>, shoppingList: Array<String>): Int {
    var totalPrice = 0
    for (i in shoppingList) {
        if (priceList.containsKey(i)) {
            totalPrice += priceList[i]!!
        }
    }

    return totalPrice
}

//output: 2000