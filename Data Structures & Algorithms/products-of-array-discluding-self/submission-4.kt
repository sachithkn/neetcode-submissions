class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var result = IntArray(nums.size)
        var pre = 1
        for(i in 0 until nums.size){
            result[i] = pre
            pre *= nums[i]
        }

        var post = 1
        for(i in nums.size-1 downTo 0){
            result[i] *= post
            post *= nums[i]
        }
        return result
    }
}