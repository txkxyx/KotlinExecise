package rational

//クラス宣言
class Rational(n:Int,d:Int){
//    イニシャライザ
    init {
        require(d != 0,{"denominator must not be null"})
    }

//    フィールド
    private val g by lazy {gcd(Math.abs(n),Math.abs(d))}
    val numerator : Int by lazy { n/g}
    val denominator :Int by lazy { d/g}

//    toStringメソッドのオーバーライド
    override fun toString(): String ="${numerator}/${denominator}"

//    末尾再帰
    tailrec private fun gcd(a:Int,b:Int):Int =
        if (b == 0)a
        else gcd(b,a%b)

//    足し算
    operator fun plus(that:Rational):Rational =
        Rational(numerator * that.denominator + that.numerator * denominator,denominator * that.denominator)
//    オーバーロード
    operator fun plus(n:Int):Rational =
            Rational(numerator + n * denominator,denominator)


}


//拡張関数
operator fun Int.plus(r:Rational):Rational = r + this

fun main() {
//    オブジェクトの作成
    val half = Rational(1,2)
//    フィールドへのアクセス
    println(half.denominator)
    println(half)
//    公約数
    println(Rational(39,13))
//    足し算を行う
    println(Rational(1,4).plus(Rational(1,2)))
    println(Rational(1,4)+(Rational(1,2)))
    println(Rational(1,4) + 2)

//    拡張関数を使う
    println(3 + Rational(2,1))
}
