//1. Conditional expressions

//1.1. if

val d: Int
val check = true

if (check) {
    d = 1
} else {
    d = 2
}

println(d)
// 1

val a = 1
val b = 2

println(if (a > b) a else b) // Returns a value: 2

//1.2. When

val obj = "Hello"

when (obj) {
    // Checks whether obj equals to "1"
    "1" -> println("One")
    // Checks whether obj equals to "Hello"
    "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")     
}
// Greeting

val obj = "Hello"    

val result = when (obj) {
    // If obj equals "1", sets result to "one"
    "1" -> "One"
    // If obj equals "Hello", sets result to "Greeting"
    "Hello" -> "Greeting"
    // Sets result to "Unknown" if no previous condition is satisfied
    else -> "Unknown"
}
println(result)
// Greeting

fun main() {
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    // Stop
}

fun main() {
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)  
    // Stop
}