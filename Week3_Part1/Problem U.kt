import java.util.*

object `Problem U` {
    @JvmStatic
    fun main(args: Array<String>) {
        val con = Scanner(System.`in`)
        val n = con.nextInt()
        var count = 0
        var sum = 0.0
        for (i in 0 until n) {
            val k = con.nextDouble()
            if (k < 0.0) {
                count++
                sum +=  k
            }
        }
        System.out.printf("%d %.2f\n", count, sum)
    }
}