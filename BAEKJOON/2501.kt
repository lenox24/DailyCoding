fun main() {
    var (n, k) = readln().split(" ").map{ it.toInt() }
    var check = 0

    for(i in 1 .. n) {
        if(n % i == 0) {
            check++

            if(check == k) {
                println(i)
                break
            }
        }
    }
    
    if(check != k) {
        println("0")
    }
}
