class Solution {
    fun search(nums: IntArray, target: Int): Int {
       var l = 0
       var r = nums.size -  1
       while(l<r){
            var mid = l + ((r-l)/2)
            if(nums[mid] > nums[r]){
                l = mid + 1
            }else{
                r = mid
            }
       }

       if(l == 0 || (target >= nums[l] && target <= nums[nums.size-1])){
            r = nums.size - 1
       }else{
            r = l - 1
            l = 0
       }

       while(l<=r){
            var mid = l + ((r-l)/2)
            if(nums[mid] == target){
               return mid
            }else if(target < nums[mid]){
                r = mid - 1
            }else{
                l = mid + 1
            }
       }


       return -1
    }
}
