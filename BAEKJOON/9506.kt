fun main() {
    while(true) {
        var n = readln().toInt()
        if(n == -1) break
        
        var tmp = ""
        for(i in 1 until n) {
            if(n % i == 0) {
                if(tmp == "") {
                    tmp = "${i}"
                } else {
                    tmp += "/$i"
                }
            }
        }

        var arr = tmp.split("/").map{it.toInt()}
        var ans = ""
        var sum = 0
        for(i in arr) {
            sum += i

            if(ans == "") {
                ans = "$n = $i"
            } else {
                ans += " + $i"
            }
        }

        if(sum == n) {
            println(ans)
        } else {
            println("$n is NOT perfect.")
        }
    }
}
