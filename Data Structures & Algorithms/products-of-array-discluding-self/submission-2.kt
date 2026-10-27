class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var result = IntArray(nums.size)
        var product = 1
        for(i in 0..nums.size-1){
            result[i] = product
            product *= nums[i]
        }

        var suf = 1
        for(i in nums.size-1 downTo 0){
            result[i] *= suf
            suf *= nums[i]
        }
       
        return result
    }
}
