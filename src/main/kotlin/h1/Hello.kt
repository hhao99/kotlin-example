package h1

fun greeting(name: String): String {
    val words = mutableListOf<String>()
    words.add("Hello")
    words.add(name)
    return words.joinToString(separator=" ")
}
fun main(argv: Array<String>) {
    println(greeting("kotlin"))
}