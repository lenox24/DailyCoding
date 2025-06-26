fun main() {
   	var array = arrayOf(readln().toCharArray(),readln().toCharArray(),readln().toCharArray(),readln().toCharArray(),readln().toCharArray())
    var maxLength = 0
    for(i in 0 until 5) {
        if(array[i].size > maxLength) maxLength = array[i].size
    }
    
    for(i in 0 until maxLength) {
        for(j in 0 until 5) {
            if(array[j].size <= i) {
                continue
            } else {
	            print(array[j][i])
            }
        }
    }
}
