<h1>Lists in Kotlin</h1>

<p>A list is a collection of items with a specific order. There are two types of lists in Kotlin:</p>
<ol>
    <li>Read-only list: List cannot be modified after you create it.</li>
    <li>Mutable list: MutableList can be modified after you create it, meaning you can add, remove, or update its elements.</li>
</ol>

<h3>List</h3>

<p>to initiate a new list you can:</p>

```kt
val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
<!-- or -->
val numbers = listOf(1, 2, 3, 4, 5, 6)
```
<p>Check the following code for a complete commands on how to deal with lists:</p>

```kt
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")
    println("Size: ${numbers.size}")

    // Access elements of the list
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    // Use the contains() method
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
}
```
<p>In kotlin, lists have a build-in functions that can reverse or sort the list in ascending order as the following</p>

```kt
fun main() {
    val colors = listOf("green", "orange", "blue")

    println("Reversed list: ${colors.reversed()}")
    println("List: $colors")

    println("Sorted list: ${colors.sorted()}")
    println("List: $colors")

    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")
}
```

<h3>Mutable Lists</h3>
<p>Mutable lists are lists that can be modified after creation. You can add, remove, or change items. You can do everything you can do with read-only lists as well. Mutable lists are of type MutableList, and you can create them by calling mutableListOf().</p>

<h5>Create a MutableList:</h5>
<p>The following initiate an emty mutable list:</p>

```kt
val entrees = mutableListOf<String>()

<!-- or -->

val entrees: MutableList<String> = mutableListOf()
```
<h5>Add elements to a list:</h5>

```kt
println("Add noodles: ${entrees.add("noodles")}")
println("Entrees: $entrees")

println("Add spaghetti: ${entrees.add("spaghetti")}")
println("Entrees: $entrees")
```
<p>The results should be</p>
<code>
Add spaghetti: true
Entrees: [noodles, spaghetti]
</code>

<p>You can also add a list into a mutable list:</p>

```kt
val moreItems = listOf("ravioli", "lasagna", "fettuccine")

println("Add list: ${entrees.addAll(moreItems)}")
println("Entrees: $entrees")
```
<p>outPut:</p>

<code>
Add list: true
Entrees: [noodles, spaghetti, ravioli, lasagna, fettuccine]
</code>