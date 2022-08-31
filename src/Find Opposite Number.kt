/*
You've just moved into a perfectly straight street with exactly n identical houses on either side of the road.
Naturally, you would like to find out the house number of the people on the other side of the street.
The street looks something like this:

Street
1|   |6
3|   |4
5|   |2

Evens increase on the right; odds decrease on the left. House numbers start at 1 and increase without gaps.
When n = 3, 1 is opposite 6, 3 opposite 4, and 5 opposite 2.

Example (address, n --> output)
Given your house number address and length of street n, give the house number on the opposite side of the street.

1, 3 --> 6
3, 3 --> 4
2, 3 --> 5
3, 5 --> 8
 */
fun main() {
    print(overTheRoad(6, 11))
}
fun overTheRoad(address: Int, n: Int): Int {
    /*return if (address % 2 != 0 && address < (n * 2) / 2 ) {
        address + ((n * 2 - 1) - (address.downTo(1).step(2).count() * 4 - 4))
    } else 0 */
    return when {
        address % 2 != 0 && address < (n * 2) / 2 -> address + ((n * 2 - 1) - (address.downTo(1).step(2).count() * 4 - 4))
        address % 2 == 0 && address > (n * 2) / 2 -> address - ((n * 2 - 1) - ((n * 2).downTo(address).step(2).count() * 4 - 4))
        address % 2 != 0 && address > (n * 2) / 2 -> address - ((n * 2 - 1) - (address.until(n * 2).step(2).count() * 4 - 2))
        address % 2 == 0 && address < (n * 2) / 2 -> address + ((n * 2 - 1) - (address.downTo(2).step(2).count() * 4 - 2))
        else -> when {
            n % 2 != 0 && n == address -> address + 1
            else -> 0
        }
    }
}