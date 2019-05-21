package constsample

fun main() {
    var list = listOf<String>("aa","bb","cc","dd","ee")

    for (str in list)
        when{
            str == "aa" -> println("AA")
            str == "bb" -> println("BB")
            str == "cc" -> println("CC")
            str == "dd" -> println("DD")
            else -> println("next")
        }
}