//In the input, you are given a List of products that you put on the shelf and a String that represents a specific product.
// Print out this product's position on the shelf. Note that products may repeat.
fun main() {
    val products = listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val product = readLine()!!

    solution(products,product)
}
fun solution(products: List<String>, product: String) {
    products.forEachIndexed { index, s -> if (s == product) print("$index ") }
}