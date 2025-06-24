fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    var res = Array(n,{IntArray(m,{0})})

    for(i in 0 until n) {
        val tmp = readln().split(" ").map { it.toInt() }
        for(j in 0 until m) {
            res[i][j] += tmp[j]
        }
    }
    for(i in n until n*2) {
        val tmp = readln().split(" ").map { it.toInt() }
        for(j in 0 until m) {
            res[i-n][j] += tmp[j]
        }
    }
    
	for(i in 0 until n) {
        for(j in 0 until m) {
            print("${res[i][j]} ")
        }
        println()
    }
}
