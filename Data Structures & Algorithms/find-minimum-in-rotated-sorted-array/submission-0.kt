class Solution {
    fun findMin(nums: IntArray): Int {
        var l = 0
        var r = nums.size-1
        var result = Int.MAX_VALUE
        while(l<=r){
            if(nums[l]<nums[r]){
                result = Math.min(result,nums[l])
            }
            var mid = l + ((r-l)/2)
            result = Math.min(result,nums[mid])
            if(nums[mid] >= nums[l]){
                l = mid +1
            }else{
                r = mid-1
            }
        }
        return result 
    }
}
