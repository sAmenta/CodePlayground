/*
https://hyperskill.org/learn/step/20944

Frankenstein's creature has a problem: he needs to be revived by electric current every 25 years.
Нe has been living for 357 years. You have an array that stores the voltage used to revive Frankenstein's creature.
What will this program output when
a = [677,591,153,356,617,337,195,948,440,657,631,546,148,678]
 */

/* Pseudocode

function alive(a):
    f = false
    x = a[1]

    for i in [1, len(a)]:
        if (a[i] mod 2 == 0) and (f == false) then:
            x = a[i]
            f = true
        if (a[i] < x) and (a[i] mod 2 == 0) then:
            x = a[i]

    if f == false then:
        print(0)
    else:
        print(x)
 */

fun main() {
    val a = intArrayOf(677,591,153,356,617,337,195,948,440,657,631,546,148,678)
    val result = alive(a)
    print(result)
}

fun alive(a: IntArray): Int {
    var f = false
    var x = a[0]

    for (i in a.indices) {
        if (a[i] % 2 == 0 && !f) {
            x = a[i]
            f = true
        }
        if (a[i] < x && a[i] % 2 == 0) x = a[i]
    }
    return if (!f) 0 else x
}