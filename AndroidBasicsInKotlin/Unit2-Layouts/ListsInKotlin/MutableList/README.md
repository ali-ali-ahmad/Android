<h1>Mutable Lists</h1>

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

println("Add spaghetti: ${entrees.add("spaghetti")}")
```
<p>The results should be</p>

```
Add spaghetti: true
Entrees: [noodles, spaghetti]
```

<p>You can also add a list into a mutable list:</p>

```kt
val moreItems = listOf("ravioli", "lasagna", "fettuccine")

println("Add list: ${entrees.addAll(moreItems)}")
```
<p>outPut:</p>

```
Add list: true
Entrees: [noodles, spaghetti, ravioli, lasagna, fettuccine]
```

<h5>Remove elements from a list</h5>

```kt
println("Remove spaghetti: ${entrees.remove("spaghetti")}")
```

<p>Note: If you try to remove an item that doesn't exists, the output will be false</p>

<p>You can remove an item by their index</p>

```kt
println("Remove first element: ${entrees.removeAt(0)}")
```

<p>If you want to clear the whole list, you can call clear().</p>

```kt
entrees.clear()
```

<p>check if a list is empty using isEmpty()</p>

```kt
println("Empty? ${entrees.isEmpty()}")
```

<p>You can try to run the full code as given below and check their results:</p>

```kt
fun main() {
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    // Add individual items using add()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    // Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // Clear out the list
    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")
}
```
