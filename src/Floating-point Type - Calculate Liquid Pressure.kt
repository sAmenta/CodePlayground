//Write a program that reads the density of a liquid, the height of a column, and calculates the liquid pressure.
//The gravity constant is 9.8 m/s². Do not format the result.
//
//When a person swims underwater, water pressure acts on their eardrums.
//The deeper the dive, the greater the pressure is. The pressure builds up due to the weight of the water above.
//The pressure a liquid exerts depends on the depth.
//
//Liquid pressure also depends on the density of the liquid. If the liquid is denser than seawater, the pressure would be greater.
//So, we can say that the depth, density, and liquid pressure are directly proportional.
// The pressure exerted by a liquid in a column of constant density is represented by this formula:
//
//p = ρgh
//
//where:
//
//p is liquid pressure,
//
//g is the gravitational acceleration,
//
//ρ is the fluid density,
//
//h is the height of liquid column.

fun main() {
    val (density, height) = Array(2) { readLine()!!.toDouble()}

    print(density * 9.8 * height)
}