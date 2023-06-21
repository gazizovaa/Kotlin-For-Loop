import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var k = con.nextInt()

    for(i in 0 until k){
        var a = con.nextInt()
        var b = con.nextInt()
        println(a + b)
    }
}