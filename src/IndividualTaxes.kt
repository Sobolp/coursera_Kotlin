import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val incomes = IntArray(n)
    val taxes = IntArray(n)

    for (i in 0 until n){
        incomes[i] = scanner.nextInt()
    }

    var maxTax = Double.MIN_VALUE;
    var maxInd = 0;
    for (i in 0 until n){
        taxes[i] = scanner.nextInt()
        val tax = incomes[i].toDouble() * taxes[i].toDouble() / 100
        if( tax > maxTax){
            maxTax = tax
            maxInd = i
        }
    }
    println(maxInd + 1)
}
