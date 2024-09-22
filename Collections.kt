//1. List

// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes)
// [triangle, square, circle]

// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes)
// [triangle, square, circle]

val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes

val readOnlyShapes = listOf("triangle", "square", "circle")
println("The first item in the list is: ${readOnlyShapes[0]}")
// The first item in the list is: triangle

val readOnlyShapes = listOf("triangle", "square", "circle")
println("The first item in the list is: ${readOnlyShapes.first()}")
// The first item in the list is: triangle

val readOnlyShapes = listOf("triangle", "square", "circle")
println("This list has ${readOnlyShapes.count()} items")
// This list has 3 items

val readOnlyShapes = listOf("triangle", "square", "circle")
println("circle" in readOnlyShapes)
// true

val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
// Add "pentagon" to the list
shapes.add("pentagon") 
println(shapes)  
// [triangle, square, circle, pentagon]

// Remove the first "pentagon" from the list
shapes.remove("pentagon") 
println(shapes)  
// [triangle, square, circle]

//2. Set

// Read-only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

println(readOnlyFruit)
// [apple, banana, cherry]

val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
val fruitLocked: Set<String> = fruit

val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
println("This set has ${readOnlyFruit.count()} items")
// This set has 3 items

val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
println("banana" in readOnlyFruit)
// true

val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
fruit.add("dragonfruit")    // Add "dragonfruit" to the set
println(fruit)              // [apple, banana, cherry, dragonfruit]

fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
println(fruit)              // [apple, banana, cherry]

//3. Map

// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(juiceMenu)
// {apple=100, kiwi=190, orange=100}

val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
val juiceMenuLocked: Map<String, Int> = juiceMenu

// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
// The value of apple juice is: 100

// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")
// The value of pineapple juice is: null

val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
println(juiceMenu)
// {apple=100, kiwi=190, orange=100, coconut=150}

val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
juiceMenu.remove("orange")    // Remove key "orange" from the map
println(juiceMenu)
// {apple=100, kiwi=190}

// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
// This map has 3 key-value pairs

val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu.containsKey("kiwi"))
// true

val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu.keys)
// [apple, kiwi, orange]
println(readOnlyJuiceMenu.values)
// [100, 190, 100]

val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("orange" in readOnlyJuiceMenu.keys)
// true

// Alternatively, you don't need to use the keys property
println("orange" in readOnlyJuiceMenu)
// true

println(200 in readOnlyJuiceMenu.values)
// false