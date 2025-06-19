class Solution {
    fun solution(age: Int): String {
        var word = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j') 
        var answer: String = ""
        var tmp = age.toString().map { it.toString().toInt() }.toIntArray()
        for(i in tmp) {
            answer += "${word[i]}"
        }
        return answer
    }
}
