import java.util.*

object `Problem S` {
    @JvmStatic
    fun main(args: Array<String>) {
        val con = Scanner(System.`in`)
        val n = con.nextInt()
        val m = DoubleArray(n)
        for (i in m.indices) m[i] = con.nextDouble()
        var sum = 0.0
        for (i in m.indices) sum = sum + m[i]
        System.out.printf("%.1f", sum)
        con.close()
    }
}