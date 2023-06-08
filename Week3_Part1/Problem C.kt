import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var x = con.nextDouble()

    var y = (x * x * x) - ((5 * x * x ) / 7) + (9 * x) - (3 / x) + 1
    print(y)
}