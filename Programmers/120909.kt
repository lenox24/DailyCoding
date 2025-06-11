class Solution {
    fun solution(n: Int): Int {
        var temp: Int = 0
        for(i in 1 until n) {
            temp = i * i
            if(temp >= n) break
        }
        return if(n == temp) 1 else 2       
    }
}
