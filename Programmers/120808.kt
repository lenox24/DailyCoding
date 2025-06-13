class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var x = (numer1 * denom2) + (numer2 * denom1)
        var y = denom1 * denom2
        var min = 1
        
        for(i in min .. x) {
            if(x % i == 0 && y % i == 0) {
                min = i
            }
        }
        return intArrayOf(x/min, y/min)
    }
}
