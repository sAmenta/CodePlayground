/*
Po decided to glue the Urn of Whispering Warriors.
When Po finished the work, the Dragon Warrior put everything in the urn, receiving an array

a = [7,1,9,6,10,5,8,2,3,4]

After that, he decided to arrange all the warriors by numbers, calling the function
t=5 times.

What array will he end up with?

Tip: the code is supposed to shift from left to right the number in the array by t times.

Pseudocode
function po(a, t):

    for j in [1, t]:
        x = a[1]
        for i in [1, len(a)-1]:
            a[i] = a[i+1]
        a[len(a)] = x

    for i in [1, len(a)]:
        if i == len(a) then:
            print(a[i])
        else:
            print (a[i], ", ")


po(a, 5)

 */

fun main() {
    val a = intArrayOf(7,1,9,6,10,5,8,2,3,4)
    print(po(a, 5))
}

fun po (a: IntArray, t: Int) {
    for (j in 0 until t) {
        val x = a[0]
        for (i in 0 until a.size - 1) {
            a[i] = a[i + 1]
        }
        a[a.size - 1] = x
    }

    for (i in a.indices) {
        if (i == a.size - 1) print(a[i])
        else {
            print(a[i])
            print(", ")
        }
    }
    println()
}