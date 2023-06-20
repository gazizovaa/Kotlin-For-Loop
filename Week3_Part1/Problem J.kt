import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var x = con.nextLong()
    var n = con.nextLong()
    var m = con.nextLong()
    println(Modular_Exponentiation(x,n,m))
}

fun Modular_Exponentiation(x: Long,n: Long,m: Long): Long {
    return when{
        n == 0L -> 1L
        n % 2 == 0L -> Modular_Exponentiation((x * x) % m,n / 2,m)
        else -> (x * Modular_Exponentiation(x,n - 1,m)) % m
    }
}