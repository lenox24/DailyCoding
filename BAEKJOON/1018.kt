 fun main() {
    var (n, m) = readln().split(" ").map{it.toInt()}
      var result = 64
    
    var arr = Array(n, {CharArray(m)})
    for(i in 0 until n) {
        var tmp = readln().toCharArray()
        for(j in 0 until m) {
            arr[i][j] = tmp[j]
        }
    }
    
    for(i in 0 .. n - 8) {
        for(j in 0 .. m - 8) {
			var tmp = search(i, j, arr)
            
            if(tmp < result) {
                result = tmp
            }
        }
    }
    println(result)
}

fun search(x:Int, y:Int, arr:Array<CharArray>): Int {
    var w_cnt = 0
    var b_cnt = 0
	
    for(i in 0 until 8) {
        for(j in 0 until 8) {
			if((i + j) % 2 == 0) {
                if(arr[x + i][y + j] == 'W') b_cnt++
                else w_cnt++
            } else {
                if(arr[x + i][y + j] == 'W') w_cnt++
                else b_cnt++
            }         
        }
    }
    
    return if(w_cnt < b_cnt) w_cnt else b_cnt
}
