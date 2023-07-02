import java.util.*

fun main() {
    var con = Scanner(System.`in`)
    var x = con.nextDouble()
    var y = ((x * x + 3 * x - 4) / (2 * x - 3)) - ((x + 2) / (x * x - 5 * x + 7))
    print(y)
}
