package variable

fun main() {
    var str = "Kotlin"

    //文字数
    println(str.length)
    //先頭大文字
    println(str.capitalize())
    //空白チェック
    println(str.isBlank())
    //Stringテンプレート
    println("Hello $str")
}