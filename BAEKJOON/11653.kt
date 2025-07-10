fun main() {
    var n = readln().toInt()
    var i = 2
    while(n > 0 && n != 1) {
        if(n % i == 0) {
            println(i)
         	n /= i
            i = 2 
            continue
        }
        
        i++
    } 
}
