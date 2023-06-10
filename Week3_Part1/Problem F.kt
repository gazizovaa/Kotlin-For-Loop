import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextDouble()
    var m = Math.sqrt(n)

    if(Math.floor(m) === m){
        println(m.toInt())
    }else{
        println("No")
    }
}