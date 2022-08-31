/*
Now you need to write a function calculateBrakingDistance that calculates the braking distance of a car.

In order to calculate the distance, you need the initial speed (when braking starts) and the acceleration of the car:

S = v2*v2 - v1*v1 / 2a

where S is the braking distance, an is the acceleration, v1 is the initial speed, v2 is the final speed,
which in the case of this problem is always equal to 0.

The function accepts String values as input: convert them to Int. Take care that different exceptions may be thrown.
If an exception is thrown, display its message using message. It may happen that the acceleration is 0: then you might get an ArithmeticException.
If an ArithmeticException is thrown, display the following instead of the exception message: The car does not slow down!.

If the braking distance could not be calculated, return -1.

Input: v1: String, a: String

Output: Int
 */

import kotlin.Exception
fun main() {
    print(calculateBrakingDistance(readLine()!!, readLine()!!))
}

fun calculateBrakingDistance(v1: String, a: String): Int {
    return try {
        (0 - v1.toInt()*v1.toInt()) / (2*a.toInt())
    } catch (e: ArithmeticException) {
        print("The car does not slow down!")
        print('\n')
        -1
    } catch (e: Exception) {
        print(e.message)
        print('\n')
        -1
    }
}