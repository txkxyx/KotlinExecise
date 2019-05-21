package variable

fun main() {
    val ints = arrayOfNulls<Int>(5)
    //サイズの取得
    println(ints.size)
    //要素の表示
    println(ints)
    println(ints[0])
    //代入
    ints[0] = 123
    println(ints[0])

    val strs = arrayOf("aaa","bbb","ccc")

}