fun main() {
    var n = readln().toInt()
    var arr = readln().split(" ").map { it.toInt() }
    var answer = 0
    var flag = true

    for(i in arr) {
        flag = true
        if(i == 0 || i == 1) continue
        for(j in 0 .. i) {
            if(j == 0 || j == 1) continue
            if(i / j > 1 && i % j == 0) {
            	flag = false
                break
            }
        }
        
        if(flag) answer++
    }
    
    println(answer)
}
