class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        my_string.toCharArray().forEach {
            for(i in 0 until n) {
                answer += it
            }
        }
        return answer
    }
}
