import java.util.*

object `Problem R` {
    @JvmStatic
    fun main(args: Array<String>) {
        val con = Scanner(System.`in`)
        val n = con.nextInt()
        val m = IntArray(n)
        for (i in 0 until n) m[i] = con.nextInt()
        for (i in 0 until n) if (m[i] >= 0) m[i] += 2
        for (i in 0 until n) print(m[i].toString() + " ")
        println()
        con.close()
    }
}