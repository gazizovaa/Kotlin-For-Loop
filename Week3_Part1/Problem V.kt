import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var m = IntArray(n)

    for(i in 0..n){
        m[i] = con.nextInt()

        if(m[i] % 2 != 0)
            print("$i ")
    }
}