import java.util.*

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    NULL ("");

    fun compareCurrency(that:Country):Boolean = that.currency == currency
}
fun getByName(country: String ):Country {
    for (enum in Country.values()){
        if (enum.name == country) return enum
    }
    return Country.NULL
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val country1 = input.next()
    val country2 = input.next()
    print(getByName(country1).compareCurrency(getByName(country2)))
}