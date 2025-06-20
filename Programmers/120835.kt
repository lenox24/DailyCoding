class Solution {
    fun solution(emergency: IntArray): IntArray {
        var tmp = emergency.sortedArrayDescending()
        var answer = IntArray(emergency.size)
        for(i in 0 until emergency.size) {
            for(j in 0 until tmp.size) {
                if(emergency[i] == tmp[j]) {
                    answer[i] = j + 1
                }
            }
        }
        return answer
    }
}
