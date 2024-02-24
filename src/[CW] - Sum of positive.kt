/*
https://www.codewars.com/kata/5715eaedb436cf5606000381/train/kotlin
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

fun main() {
    val numbers = intArrayOf(-1,-4,-7,-12)
    print(sum(numbers))
}
fun sum(numbers: IntArray): Int {
    var sum = 0
    for(i in numbers){
        if(i < 0) continue
        else sum+=i
    }
    return sum
}