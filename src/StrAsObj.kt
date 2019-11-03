fun String.decode(): String {
    var result = this
    if (!this.isEmpty()) {
        when (this.first()) {
            'i' -> result = (this.substring(1).toInt() + 1).toString()
            's' -> result = this.substring(1).reversed()
        }
    }
    return result
}

fun main() {
    val input = readLine()!!
    println(input.decode())
}