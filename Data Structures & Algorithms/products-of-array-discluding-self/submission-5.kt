class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var result = IntArray(nums.size)

        var pre = 1
        for(i in 0 until nums.size){
            result[i] = pre         // 1,1,2,8
            pre *= nums[i]          // 1,2,8,48
        }

        var post = 1
        for(i in nums.size-1 downTo 0){
            result[i] *= post       // ,12,12,8
            post *= nums[i]         //6,12
        }

        return result

    }
}