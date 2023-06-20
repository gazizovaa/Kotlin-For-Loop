import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    val m = IntArray(n)

    for(i in m.indices)
        m[i] = con.nextInt()

    var min = Int.MAX_VALUE
    for(i in m.indices)
        if(m[i] < min) min = m[i]

    println(min)

}