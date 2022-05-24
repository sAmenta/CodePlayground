/*
Sir Backsword met two men on the road. They asked to be his companions. They said that both of them had the same profession.
He decided to find out what they were: knights, merchants, or robbers.

Write a program that will help him decide if he can trust the strangers.
To answer this question, you need to read three booleans: firstAnswer, secondAnswer, and confession (each on a separate line):

firstAnswer and secondAnswer are what the two strangers themselves say about their profession.
We assume that no one will ever say that robbery is their profession, so true here means knight and false means merchant.
confession will be true only if they confess in good faith that they are robbers.
The strangers can't be trusted if their answers don't match or if they confess that they are robbers.
In this case, print false; otherwise, print true.

 */

fun main() {
    val firstAnswer = readLine().toBoolean()
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()

    print(lieDetector(firstAnswer, secondAnswer, confession))
}

fun lieDetector(firstAnswer: Boolean, secondAnswer: Boolean, confession: Boolean): Boolean {
    return if (firstAnswer != secondAnswer || confession == true) false else true
}