class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var result = IntArray(nums.size){0}
        for(i in nums.indices){
            var prod = 1
            for(j in nums.indices){
                if(i!=j){
                    prod *= nums[j]
                }
            }
            result[i] = prod
        }
        return result
    }
}
