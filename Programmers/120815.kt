class Solution {
    fun solution(n: Int): Int {
        var answer = (1..50).filter{ (it * 6) / n > 0 && (it * 6) % n == 0 }.toIntArray()
        return answer[0]
    }
}
