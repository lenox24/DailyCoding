import kotlin.math.pow

fun main() {
    var (n, b) = readln().split(" ").let {it[0] to it[1].toInt()}
    val textMap = ('A'..'Z').mapIndexed { i, c -> c to (10 + i) }.toMap()	
    var answer = 0.0
    
    for(i in n.indices) {
        var text = n[n.length - i - 1]
        var t = if(text.isLetter()) {
            textMap[text] ?: -1
        } else {
            text.digitToInt()
        }
  
        answer += t * b.toDouble().pow(i)
    }
    
    println(answer.toInt())
}
