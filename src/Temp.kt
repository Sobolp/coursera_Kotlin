fun isValidIdentifier(s: String): Boolean {
    return when{
        s !="" && (s[0] in 'a'..'z' || s[0] == '_')&&!s.contains(Regex("\\W")) -> true
        else -> false
    }
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}