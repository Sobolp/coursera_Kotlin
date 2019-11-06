fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.matches("\\d\\d\\d\\d \\d\\d\\d\\d \\d\\d\\d\\d \\d\\d\\d\\d".toRegex()))
        return cardNumber.replace("\\s".toRegex(), "").toLong()
    else throw Exception("e")
}
fun main (){
    val a = readLine()!!
    print(parseCardNumber(a))
}