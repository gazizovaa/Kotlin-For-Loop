import java.util.*

fun main() {

    var con = Scanner(System.`in`)
    var x = con.nextDouble()
    var y = (Math.sqrt(x * x * x * x + 1)/ (x * x)) - (Math.sqrt(x * x / (x * x + 1)))
    print(y)
}
