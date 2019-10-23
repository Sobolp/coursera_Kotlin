import java.util.*
import kotlin.math.pow

fun getDepSum(
    amount: Int = 1000
    , percents: Int = 5
    , years: Int = 10
): Int {
    return (amount * (1 + percents.toDouble()/100).pow(years)).toInt()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val parName = scanner.nextLine()
    val parValue = scanner.nextInt()
    println(
        when (parName) {
            "amount" -> getDepSum(amount = parValue)
            "percents" -> getDepSum(percents = parValue)
            "years" -> getDepSum(years = parValue)
            else -> getDepSum()
        }
    )
}