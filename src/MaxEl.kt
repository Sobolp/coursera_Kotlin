import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var result:Int = 0
    repeat(n){
        val nextEl = scanner.nextInt()
        result = if (nextEl % 4 == 0 && nextEl > result) nextEl else result
    }
    print(result)
}