import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var x = con.nextDouble()
    var y = con.nextDouble()
    var z = con.nextDouble()

    var sum1 = x + y
    var sum2 = x + z
    var sum3 = y + z

    print("$sum1  $sum2  $sum3")
}
