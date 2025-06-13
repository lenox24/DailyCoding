fun main() {
    var str = readln().toUpperCase().toCharArray()
    var tmp = str.distinct()
    
    var maxWord = '?'
    var maxCount = 0
    var flag = true
    
    for(i in tmp) {
        var count = str.count { it == i}
        if(count > maxCount) {
            maxCount = count
        	maxWord = i
            
            flag = true
        } else if(count == maxCount) {
            flag = false
        }
    }
    
    if(flag) println(maxWord)
    else println("?")
}
