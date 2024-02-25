/*
Write a program that reads three double values a, b, c, and solves this equation:

a * x + b = c
Output the value of x.

Guaranteed that a is not 0.
 */

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val (a, b, c) = DoubleArray(3) { s.nextDouble() }
    println((c - b) / a)
}