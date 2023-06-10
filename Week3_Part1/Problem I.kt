import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var a = con.nextLong()
    var b = con.nextLong()

    for(i in a..b){
        var squared = i * i
        print("$squared" + " ")
    }
    println(" ")
    for(i in b downTo a){
        var cubed = i * i * i
        print("$cubed" + " ")
    }
    print(" ")
}