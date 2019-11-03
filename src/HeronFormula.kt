import java.util.Scanner
import kotlin.math.sqrt

fun heronFormula(a: Int, b: Int, c: Int): Double {
    val p = (a + b + c).toDouble()/ 2

    return sqrt(p * (p - a) * (p - b) * (p - c))
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println(heronFormula(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()))
}