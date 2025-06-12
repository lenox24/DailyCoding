class Solution {
   fun solution(numbers: IntArray): Int {
        var a = numbers[0];
        var b = numbers[1];

        for(i in 2 until numbers.size) {
            if(numbers[i] > a && numbers[i] > b) {a = b; b = numbers[i]}
            else if(numbers[i] > a) a = numbers[i]
        }

        return a * b
    }
}
