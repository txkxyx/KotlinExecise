package variable

fun main() {
    val intMap : Map<String,Int> = mapOf("one" to 1,"two" to 2)
    println(intMap)

    val strMap : MutableMap<String,String> = mutableMapOf("a" to "b","c" to "d")
    println(strMap)
}