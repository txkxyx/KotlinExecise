package variable

fun main() {
    val ints:Set<Int> = setOf(1,2,3)
    println(ints)

    var sets:MutableSet<Int> = mutableSetOf(1,2,3,1,2,3)
    println(sets)
}