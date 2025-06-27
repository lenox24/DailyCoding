fun main() {
    var map = Array(100,{IntArray(100,{0})})
    var n = readln().toInt()
    var answer = 0

    repeat(n) {
        var (x, y) = readln().split(" ").map{ it.toInt() }
        for(i in 0 until 10) {
            for(j in 0 until 10) {
                map[x+i][y+j] = 1
            }
        }
    }
    
    for(i in 0 until 100) {
        for(j in 0 until 100) {
            if(map[i][j] == 1) answer++
        }
    }
    
    println(answer)
}
