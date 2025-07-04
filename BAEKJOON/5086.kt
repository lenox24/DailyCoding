fun main() {
    while(true) {
    	var (n, m) = readln().split(" ").map{ it.toInt() }
        if(n == 0 && m == 0) break
        
        if(m / n > 0 && m % n == 0) println("factor")
        else if(n / m > 0 && n % m == 0) println("multiple")
        else println("neither")
    }
}
