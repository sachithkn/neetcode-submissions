class Solution {
    fun findMin(nums: IntArray): Int {
       var l = 0
       var r = nums.size-1
       var res = Int.MAX_VALUE
       while(l<=r){
            var mid = l+((r-l)/2)
            res = minOf(res,nums[mid])
            if(l==r){
                return res
            }
            if(nums[mid] <= nums[r]){
                r = mid-1
            }else{
                l = mid+1
            }
       }
       return res
    }
}