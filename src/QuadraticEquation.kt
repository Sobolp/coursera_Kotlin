import java.util.Scanner

fun getD(a: Double, b: Double, c: Double) = b * b - 4.0 * a * c

fun getRoot1(a: Double, b: Double, c: Double, d: Double) = (-b + Math.sqrt(d)) / 2.0 * a

fun getRoot2(a: Double, b: Double, c: Double, d: Double) = (-b - Math.sqrt(d)) / 2.0 * a

fun getRoots(a: Double, b: Double, c: Double) {
    val d = getD(a, b, c)
    val r1 = getRoot1(a, b, c, d)
    val r2 = getRoot2(a, b, c, d)
    when {
        r1 < r2 -> print("$r1 $r2")
        r1 == r2 -> print("$r1")
        else -> print("$r2 $r1")
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    getRoots(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
}