//Classes start
//1
class Book {
    val pages = 320
    val title = "Harry Potter and the Sorcerer's Stone"
    val author = "J.K. Rowling"
}

// Write your code above 📕

fun main() {

}
//2
class Building {
    val yearBuilt = 2016
    val height = 400 // Feet
    val type = "Limestone"
}
fun main() {
    // Write your code below 🏙
    var residentialBuilding = Building()
    println(residentialBuilding.yearBuilt)
    println(residentialBuilding.height)
    println(residentialBuilding.type)
}
//3
// Write your class below
class Person(val name: String, val age: Int, val favoriteColor: String)

fun main() {
    // Create your instances below

    val me = Person("Maggie", 26, "Green")
    val myFriend = Person("Jose", 25, "Red")

    println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")

    println("${myFriend.name} is ${myFriend.age} years old and their favorite color is ${myFriend.favoriteColor}.")

}
//4
class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
    // Write your code below
    val fullName = "$firstName $lastName"

    init {
        if (yearsWorked > 1) {
            println("$fullName is eligible for a raise!")
        } else {
            println("$fullName is not eligible for a raise just yet.")
        }
    }
}

fun main() {
    // Create an instance below 👩🏻‍💼
    val projectManager = Employee("Maria", "Gonzalez", 2)
}
//5
class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {

    init {
        for (comp in competitionsParticipated) {
            println("$name participated in $comp.")
        }
    }

    // Write your function below
    fun speak() {
        println("$name says: Woof!")
    }
}

fun main() {
    // Write your instance below 🐩
    var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
    maxie.speak()

}
//end
