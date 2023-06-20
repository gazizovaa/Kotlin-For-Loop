import kotlin.math.*

fun main() {
    var a: Int
    var b: Int
    var i: Int
    var first: Int
    var second: Int
    var third: Int
    var fourth: Int
    readLine()!!.split(" ").map{ it.toInt() }.apply {
        a = this[0]
        b = this[1]
    }
    for (i in a..b) {
        first = i / 1000
        second = i / 100 % 10
        third = i / 10 % 10
        fourth = i % 10
        if (first != second && first != third && first != fourth &&
            second != third && second != fourth &&
            third != fourth) {
            print("$i ")
        }
    }
}