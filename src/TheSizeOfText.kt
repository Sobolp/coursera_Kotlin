import java.io.File

fun main(){
    val fileName = "resrc/text.txt"
    val lines = File(fileName).readText()
    print(lines.split(" ").size)
}
