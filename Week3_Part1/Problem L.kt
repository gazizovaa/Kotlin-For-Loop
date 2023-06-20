import java.util.Scanner

fun smallestDivisor(n: Int): Int {
    if (n % 2 == 0) {
        return 2
    }
    for (i in 3..Math.sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) {
            return i
        }
    }
    return n
}
fun main(args: Array<String>) {
    val con = Scanner(System.`in`)
    var n = con.nextInt()
    println(smallestDivisor(n))
}
