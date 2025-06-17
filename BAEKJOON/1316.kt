fun main() {
  var flag = false
  var n = readln().toInt()
	var result = n
    for(i in 0 until n) {
        var tmp = readln().toCharArray()        
        for(j in 0 until tmp.size - 1) {
            if(tmp[j] != tmp[j+1]) {
                if(flag) {
                    flag = false
                    break
                }
                for(k in j + 2 until tmp.size) {
                    if(tmp[j] == tmp[k]) {
                        result--
                        flag = true
                    	break
                    }
                }
                
            }
        }
    }

	println(result)
}
