import java.util.*

fun getPrice(
    old: Int = 5
    , passed: Int = 100000
    , speed: Int = 160
    , auto: Int = 0
): Int {
    var result = 20000
    for (y in 1..old) {
        result -= 3000 / y
    }
    result += (speed - 120) * 100
    result -= passed / 10000 * 200
    result += 1500 * auto
    return result
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val parName = scanner.nextLine()
    val parValue = scanner.nextInt()
    println(
        when (parName) {
            "old" -> getPrice(old = parValue)
            "passed" -> getPrice(passed = parValue)
            "speed" -> getPrice(speed = parValue)
            "auto" -> getPrice(auto = parValue)
            else -> getPrice()
        }
    )
    // write your code here
}