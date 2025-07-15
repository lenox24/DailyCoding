fun main() {
    var (n, m) = readln().split(" ").map{it.toInt()}
    var arr = readln().split(" ").map{it.toInt()}
    var answer = 0
    
    for(i in 0 until n - 2) {
        for(j in i+1 until n - 1) {
            for(k in j+1 until n) {
    	        var tmp = arr[i] + arr[j] + arr[k]
                
                if(tmp <= m && (m - answer) > (m - tmp)) {
                    answer = tmp
                }      
            }
        }
    }
    
    println(answer)
}
