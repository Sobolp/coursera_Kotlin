import java.util.Scanner
import kotlin.math.acos
import kotlin.math.sqrt

fun getScalarProduct(x1: Int, y1: Int, x2: Int, y2: Int): Double = x1 * x2.toDouble() + y1 * y2.toDouble()
fun getLength(x: Int, y: Int): Double = Math.sqrt(x * x.toDouble() + y * y.toDouble())
fun getAngle(x1: Int, y1: Int, x2: Int, y2: Int): Double =
    Math.acos(getScalarProduct(x1, y1, x2, y2) / (getLength(x1, y1) * getLength(x2, y2)))

fun main() {
    val scanner = Scanner(System.`in`)
    print(Math.toDegrees( getAngle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt())))
}