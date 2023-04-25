<h1>Read-only list</h1>

<p>To initiate a new list you can:</p>

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