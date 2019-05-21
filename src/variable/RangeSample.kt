package variable

fun main() {
    // in 演算子　含まれているのかを判定
    println(5 in 1..19)

    val range : IntRange = 12..20
    println(range)

    //リストに変換
    val rangeList : List<Int> = range.toList()
    println(rangeList)

    //降順に並び替え
    val downList : List<Int> = (20 downTo 12).toList()
    println(downList)

    //増減幅
    val stepList : List<Int> = (100 downTo  0 step 25).toList()
    println(stepList)
}