//Functions start
//1
// Write your code below
fun smores() {
    println("Roast a marshmallow.")
    println("Place marshmallow on a graham cracker.")
    println("Place chocolate on marshmallow.")
    println("Put a new graham cracker on chocolate.")
    println("Enjoy!")
}

fun main() {
    // Write more code below
    smores()
}
//2
// Write your code below
fun getSpeed(distance: Int, time: Int) {
    var speed = distance / time
    println("$speed meters per second")
}

fun main() {
    // Write more code below
    getSpeed(10, 3)

}
//3
// Write your code below
fun getPrice(price: Double, couponCode: String = "None") {
    var finalPrice: Double

    if (couponCode == "save15") {
        finalPrice = price * .85
    } else {
        finalPrice = price
    }

    println("The total price is $finalPrice.")
}

fun main() {
    // Write more code below
    getPrice(price = 48.0, couponCode = "save15")

}
//4
// Write your code below
fun ozToTsp(oz: Double): Double {
    var tsp = oz * 6
    return tsp
}

fun main() {
    // Write more code below
    var tspNeeded = ozToTsp(.75)
    println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
}
//5
// Write your code below
fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3


fun main() {
    var length = 5
    var width = 8
    var height = 14

    // Write more code below
    var volume = pyramidVolume(length, width, height)
    println("The volume of this pyramid is $volume.")

}
//6
fun main() {
    // Write your code below

    // anonymous function
    var area = fun(base: Int, height: Int): Int {
        return (base * height) / 2
    }
    println(area(15, 19))

    // lambda expression
    var perimeter = {side1: Int, side2: Int -> (side1 + side2) * 2}
    println(perimeter(15, 24))

}
//7
