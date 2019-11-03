import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var maxValue = Int.MIN_VALUE
    repeat(4){
        maxValue = Math.max(scanner.nextInt(),maxValue)
    }
    println(maxValue)
}