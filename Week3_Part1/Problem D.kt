import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var x = con.nextDouble()
    var y = con.nextDouble()

    var result = (2 * x * x) - (4 * x * y) + (3 * y * y) + ((x + y) / 7);
    print(result)
}