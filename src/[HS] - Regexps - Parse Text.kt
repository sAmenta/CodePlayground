/*
https://hyperskill.org/learn/step/20605
Imagine that you're a tutor. You need to write a program that parses your students' answers and
prints true if the answer is I can do my homework on time! or I can't do my homework on time! and false in all other cases.

To complete this task, use the function matches().
 */

fun main() {
    val answer = readln()
    val regex = Regex("I can('t)? do my homework on time!")

    print(answer.matches(regex))
}