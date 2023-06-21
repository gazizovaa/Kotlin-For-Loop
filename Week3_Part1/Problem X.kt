import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var sum = 0

    for(i in 0 until n){
        var count = con.nextInt()
        var price = con.nextDouble()

        if(price < 50.0){
            sum += count
        }
    }
    println("$sum")
}