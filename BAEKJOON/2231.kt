fun main() {
    var n = readln().toInt()
    
    for(i in 1 .. n) {
        var tmp = i
        var sum = i
       	while(tmp > 0) {
            sum += tmp % 10
            tmp /= 10
        }
        
        if(n == sum) {
            println(i)
            return
        } 
    }
    
    println(0)
}
