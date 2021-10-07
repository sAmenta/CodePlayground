//A beginner programmer is a site administrator. He has a map where for each user there is a key (the login) and a value (the password).
// Now he needs to add the data of a new user.
// Write a function addUser that takes a map with user data userMap, a login, and a password and adds the latter two to userMap.
//If userMap already contains a user with such a login, leave userMap unchanged and print the following string: "User with this login is already registered!".

fun main() {
    val userMap = mapOf("user1@mail.com" to "qwerty123", "hi_john@mail.com" to "abcdef00")
    val login = readLine()!!
    val password = readLine()!!
    val addUser = addUser(userMap, login, password)

    if (login in userMap.keys) {
        println("User with this login is already registered!")
        println(userMap)
    } else print(addUser)
}

fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
    val mutableUserMap = userMap.toMutableMap()
    if (login !in mutableUserMap.keys) mutableUserMap[login] = password
    return mutableUserMap
}