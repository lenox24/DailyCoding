fun main() {
    var n = readln().toInt()
    var num = 666 
    
    while(n > 0) {
		if("$num".contains("666")) {
            n--
        }
        
        num++
    }
    
    println(num - 1)
}
