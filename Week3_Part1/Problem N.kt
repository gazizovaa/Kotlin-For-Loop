import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    val m = IntArray(n)
    var min = 100
    var max = 0

    for(i in m.indices){
        m[i] = con.nextInt()

        if(m[i] < min){
            min = m[i]
        }
        if(m[i] > max){
            max = m[i]
        }
    }

    println(max - min)
}