import java.util.*

fun getExceed(speed: Int, limit: Int = 60): String {
    val exceed = speed - limit
    return if (exceed > 0) "Exceeds the limit by $exceed kilometers per hour" else "Within the limit"
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val speed = scanner.nextLine().toInt()
    val limit = scanner.nextLine()
    println(if (limit == "no limit") getExceed(speed) else getExceed(speed, limit.toInt()))
    // write your code here
}