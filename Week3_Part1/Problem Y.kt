import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    while (true){
        val a = con.nextInt()
        val b = con.nextInt()
        val c = con.nextInt()

        if(a == 0 && b == 0 && c == 0)
            break;
        if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
            print("right\n")
        else
            print("wrong\n")
    }
}