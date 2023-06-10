import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()

    var fact:Long = 1
    for(i in 1..n){
        fact *= i
    }
    print(fact)
}