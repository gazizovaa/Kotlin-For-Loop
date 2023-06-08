import java.util.*

fun main() {
    var con = Scanner(System.`in`)
    var x = con.nextDouble()
    var y = con.nextDouble()
    var z = con.nextDouble()

    var sum:Double = x + y + z
    var product:Double  = x * y * z
    println("$sum " + "$product")
}