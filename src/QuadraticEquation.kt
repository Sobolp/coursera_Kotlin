import java.util.Scanner

fun getD(a: Double, b: Double, c: Double) = b * b - 4 * a * c

fun getRoot1(a: Double, b: Double, c: Double) = (-b + Math.sqrt(getD(a, b, c))) / 2 * a

fun getRoot2(a: Double, b: Double, c: Double) = (-b - Math.sqrt(getD(a, b, c))) / 2 * a

fun getRoots(a: Double, b: Double, c: Double) {
    val r1 = getRoot1(a, b, c)
    val r2 = getRoot2(a, b, c)
    when {
        r1 < r2 -> print("$r1 $r2")
        else ->  print("$r2 $r1")
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    getRoots(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
}