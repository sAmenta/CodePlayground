/*
https://hyperskill.org/learn/daily/4719

Peter wants to know how much his car costs on the second-hand market. Lucky for him, there is a special site that can tell the price.
When he opened the site, all the parameters of his car were filled with default values,
and it happened to be that all parameters except one matched the parameters of Peter's car.
So, he changed only one parameter and clicked OK. Wasn't that cool?

Imagine you are the developer that needs to create the same logic using a function.
The function should take parameters: how old a car is, how many kilometers this car passed, the maximum speed,
and whether this car has automatic transmission.

The default arguments for this model are: 5 years old, ran 100000 km, have a maximum speed of 120 kilometers per hour (km/h),
no automatic transmission. The initial price of a new car with the default equipment is 20000$.

The function should work like this:
Every year the price of the car decreases by 2000$.
The price goes down by 100$ for every kilometer per hour less than 120 km/h and increases by 100$ for every kilometer per hour greater than 120 km/h.
The price lowers by 200$ for every 10000 kilometers that the car passed. For example, for 19999 km, the price decreases by 200 dollars, but for 20000 km the price lowers by 400 dollars.
If the car has automatic transmission, the price of the car goes up by 1500$, otherwise, it remains the same.
The function should print the price of the car is on the second-hand market.

 */

const val BASE_PRICE = 20000
const val AGE_FEE = 2000
const val SPEED_FEE = 100
const val STANDARD_SPEED = 120
const val KM_FEE = 200
const val STANDARD_KM = 10000

fun main() {
    val result = carPrice(7, 50000, 180, true)
    print(result)
}
fun carPrice(old: Int = 0, kilometers: Int = 0, maximumSpeed: Int = 120, automatic: Boolean = false): Int{
    val feeByYear = old * AGE_FEE
    val feeBySpeed = (maximumSpeed - STANDARD_SPEED) * SPEED_FEE
    val feeByKm = if (kilometers / STANDARD_KM > 0) (kilometers / STANDARD_KM) * KM_FEE else 0
    val transmissionFee = if (automatic) 1500 else 0

    return BASE_PRICE - feeByYear + feeBySpeed - feeByKm + transmissionFee

}