class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numset = nums.toHashSet()
        var result = 0
        for(num in numset){
            if(num-1 !in numset){
                var current = num+1
                var length = 1
                while(current in numset){
                    length++
                    current++
                }
                if(result<length){
                    result = length
                }
            }
        }
        return result
    }
}
