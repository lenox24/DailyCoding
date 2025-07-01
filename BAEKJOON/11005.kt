import kotlin.math.pow

fun main() {
    var (n, b) = readln().split(" ").map { it.toLong() }
	val textMap = ('A'..'Z').mapIndexed { i, c -> (10 + i).toLong() to c }.toMap()	
    var digit = 0
    
    for(i in 1 .. 100) {
        if(b.toDouble().pow(i) > n) {
            digit = i - 1
            break
        }
    }
    
    for(i in 0 .. digit) {
        var p = b.toDouble().pow(digit - i).toLong()
        
        var tmp = n.toInt() / p
        n %= p
        
        if(tmp >= 10) {
			print(textMap[tmp])        
        } else {
            print(tmp)
        }
    }
    
    println("")
