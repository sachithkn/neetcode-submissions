class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var result = -1
        var i =0 
        var j = nums.size-1
        //0,6
        while(i<=j){
            var mid = i + ((j-i)/2)
            if(nums[mid] == target){
                return mid
            }else if (nums[mid] > target){
                j = mid-1
            }else if(nums[mid] < target){
                i = mid+1
            }
        }
        return -1
    }
}
