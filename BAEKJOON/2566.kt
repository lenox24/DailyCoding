fun main() {
    var max = 0
    var max_i = 0
    var max_j = 0
    
    for(i in 0 until 9) {
        var input = readln().split(" ").map{ it.toInt() } 
        for(j in 0 until 9) {
			if(input[j] > max) {
				max = input[j]
                max_i = i
                max_j = j
            }
        }
    }
    
    println(max)
    println("${max_i + 1} ${max_j + 1}")
}
