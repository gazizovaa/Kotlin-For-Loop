import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var sum = 0.0
    var count = 0

    for(i in 0 until n){
        var element = con.nextDouble()

        if(element > 0){
            sum += element
            count++
        }
    }

    var result = sum / count
    if(count == 0)
        println("Not Found")
    else
        println("$result")
}