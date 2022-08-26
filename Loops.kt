//Loops start
//1
fun main() {
    // Write your code below
    for(i in 1..5){
        println("Hello, Codey!")
        println("i = $i")
    }
}
//2
fun main() {
    println("-- 1st for loop output --")
    // Write your code below
    for (i in 10 downTo 1) {
        println("i = $i")
    }
    println("\n-- 2nd for loop output --")
    // Write your code below
    for (j in 1 until 10) {
        println("j = $j")
    }
    println("\n-- 3rd for loop output --")
    // Write your code below
    for (k in 1..10 step 2) {
        println("k = $k")
    }
}
//3
fun main() {
    val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")

    val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")

    println("-- mySchedule Output --")
    // Write your code below
    for (task in mySchedule) {
        println(task)
    }
    println("\n-- myTasks Output --")
    // Write your code below
    for ((taskIndex, task) in myTasks.withIndex()) {
        println("$taskIndex: $task")
    }
}
//4
fun main() {
    val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")

    println("\n-- Key: Value Output --")
    // Write your code below
    for (favoriteEntry in favoriteColors) {
        println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }
    println("\n-- Only Values Output --")
    // Write your code below
    for (color in favoriteColors.values) {
        println(color)
    }
}
//5
fun main() {
    val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")

    println("\n-- Key: Value Output --")
    // Write your code below
    for (favoriteEntry in favoriteColors) {
        println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }
    println("\n-- Only Values Output --")
    // Write your code below
    for (color in favoriteColors.values) {
        println(color)
    }
}
//6
fun main() {
    var index = 0
    val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
    val fahr_ratio = 1.8
    var fahr: Double

    println("-- Celsius to Fahrenheit --")
    // Write your code below
    do {
        fahr = celsiusTemps[index] * fahr_ratio + 32.0
        println("${celsiusTemps[index]}C = ${fahr}F")
        index ++
    } while (fahr != 212.0)
}
//7
fun main() {
    // Write your code below
    for (i in 1..6) {
        for (j in 'A'..'F') {
            print("$j$i ")
        }
        println()
    }
}
//8
fun main() {
    val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")

    println("-- Room Search --")
    for (room in rooms) {
        print("$room: ")
        // Write your code below
        if (room == "Living Room") {
            println("Found It!")
            break
        }
        println("Found Nothing.")
    }

    println("\n-- Divide By Zero --")
    for (number in 12 downTo -12 step 4) {
        // Write your code below
        if (number == 0) {
            continue
        }
        println("120/number = ${120/number}")
    }
}
//9
fun main() {
    // Write your code below
    grid@ for (i in 1..6) {
        for (j in 'A'..'F') {
            // Write your code below
            if (j == 'C') {
                continue@grid
            }
            print("$j$i ")
        }
        println()
    }
}
//end
