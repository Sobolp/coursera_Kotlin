import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val n = scanner.nextInt()
    val w = scanner.nextBoolean()
    println(
        when {
            w -> n in 15..25
            else -> n in 10..20
        }
    )
}
