class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var last = nums.size-1
        var first = 0
        while(first <= last ){
            var mid = first + ((last-first)/2)
            if(nums[mid] < target){
                first = mid+1
            }else if (nums[mid] > target){
                last = mid-1
            }else {
                return mid
            }
        }
        return -1
    }
}
