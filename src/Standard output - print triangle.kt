/*
Write a program that prints the following shape:

#
##
###
####
#####
######
 */
const val Y = 6
fun main() {
    var x = 1
    repeat(Y) {
        repeat(x) {
            print('#')
        }
        x++
        println()
    }
}