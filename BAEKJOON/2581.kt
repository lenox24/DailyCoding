fun main() {
    var n = readln().toInt()
    var m = readln().toInt()

    var answer = 0
    var flag = true
    var min = 10000

    for(i in n .. m) {
        flag = true
        if(i == 0 || i == 1) continue
        for(j in 0 .. i) {
            if(j == 0 || j == 1) continue
            if(i / j > 1 && i % j == 0) {
            	flag = false
                break
            }
        }
        
        if(flag) answer += i
        if(flag && i < min) min = i
    }
    
    if(answer == 0) {
        println(-1)
    } else {
        println(answer)
    	println(min)
    }
}
