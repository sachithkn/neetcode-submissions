class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var numset = nums.toHashSet()
        var result = 0
        for(num in numset){
            //[2,20,4,10,3,5]
            if(num-1 !in numset){
                var current = num+1
                var length = 1
                while(current in numset){
                    current++
                    length++
                }
                if(result<length){
                    result = length
                }
            }
        }

        return result
    }
}
