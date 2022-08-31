/*
Imagine that you have a wish list. It's very long, and you want all the listed items; however, you can't buy the items with the price greater than limit.

Write a function makeMyWishList that returns a map with all the elements with the price lower than or equal to limit.
 */

fun main() {
    val wishList = mapOf("PS5" to 5000, "iWatch" to 2000)
    print(makeMyWishList(wishList, 4000))
}

fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    return wishList.filter { it.value <= limit }.toMutableMap()
}