class Solution {
    fun solution(array: IntArray): Int {
         val tmp = mutableMapOf<Int, Int>()
        
        for(i in array) {
           tmp[i] = tmp.getOrDefault(i, 0) + 1
        }
        
        var max:Int = 0
        var maxValue: Int = 0
        var maxCount = 0
        
        tmp.forEach { key, value ->
            if(value.compareTo(max) == 1) {
                max = value
                maxValue = key
                maxCount = 1
            } else if(value.compareTo(max) == 0) {
                maxCount++
            }
        }
        
        return if(maxCount > 1) - 1 else maxValue
    }
}
