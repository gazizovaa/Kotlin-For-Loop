import kotlin.math.pow
import java.util.Scanner

fun main() {
    val con = Scanner(System.`in`)
    val a = con.nextInt()
    val b = con.nextInt()
    for (i in a..b) {
        var sum = 0
        sum += (i / 1000).toDouble().pow(4.0).toInt()
        sum += ((i / 100) % 10).toDouble().pow(4.0).toInt()
        sum += ((i / 10) % 10).toDouble().pow(4.0).toInt()
        sum += (i % 10).toDouble().pow(4.0).toInt()
        if (sum == i) {
            print("$i ")
        }
    }
}