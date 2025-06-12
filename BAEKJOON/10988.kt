fun main() {
	var str = readln().toCharArray()
    var flag = 1
    
    for(i in 0 until str.size / 2 + 1) {
        if(str[i] != str[(str.size - i - 1)]) {
            flag = 0
            break
        }
    }
    
    println(flag)
}
