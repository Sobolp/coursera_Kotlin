import java.io.File

fun main(){
    val fileName = "resrc/words_sequence.txt"
    val lines = File(fileName).readLines()
    var maxValue = 0
    for (line in lines){
        maxValue = if (maxValue < line.length) line.length else maxValue
    }
    print(maxValue)
}