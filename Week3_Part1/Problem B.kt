import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var firstNumb = con.nextDouble()
    var secondNumb = con.nextDouble()
    var thirdNumb = con.nextDouble()
    var lastNumb = con.nextDouble()

    var sum1 = firstNumb + secondNumb
    var sum2 = firstNumb + secondNumb + thirdNumb
    var sum3 = firstNumb + secondNumb + thirdNumb + lastNumb

    println(sum1)
    println(sum2)
    println(sum3)
}