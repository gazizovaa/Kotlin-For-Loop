import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    val m = IntArray(n)
    var min = 30001
    var max = 0

    if(n < 2)
        println("Ooops!")
    else{
        for(i in 1..n){
            var j = con.nextInt()

            if(j < min) min = j
            if(j > max) max = j
        }
        println("$min $max")
    }
}


