import java.util.Scanner

fun main() {
    val con = Scanner(System.`in`)
    val n = con.nextInt()

    for(i in 1..n){
        val element = con.nextInt()
        if(element % 2 != 0){
            print("$element ")
        }
    }
}