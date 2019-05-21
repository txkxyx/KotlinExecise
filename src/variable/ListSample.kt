package variable

fun main() {
    // リストはイミュータブル
    val ints : List<Int> = listOf(1,2,3)

    //要素の表示
    println(ints)
    //要素の取得
    println(ints[0])

    //ミュータブルリストの作成
    val chars:MutableList<Char> = mutableListOf('a','b')
    println(chars)
}